package SemesterProject.SemesterProject.controller;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {
	public TestUnits testUnits = new TestUnits();
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
	public String getUploadDirectory()	{
		String uploadDirectory = System.getProperty("user.dir").substring(0, System.getProperty("user.dir").length()-8)+"\\Project\\SemesterProject\\src\\main\\webapp\\resources\\uploads\\";		
		return uploadDirectory;		
	}
	
	@RequestMapping(method = RequestMethod.GET,value = "/test")
	public ModelAndView frontEndTest()
	{
		ModelAndView modelAndView = new ModelAndView("uploadStatusView");
		modelAndView.addObject("immediateDestination", "101000019");
		modelAndView.addObject("immediateOrigin", "741258964");
		modelAndView.addObject("immediateOriginName", "TESTING COMPANY");
		modelAndView.addObject("companyName", "STRAWBERRY FIELDS");
		modelAndView.addObject("bhCompanyID", "7741258964");
		modelAndView.addObject("effectiveDate", "10312019");
		modelAndView.addObject("bcEntryAddendaCount", "18");
		modelAndView.addObject("bcEntryHash", "0181800018");
		modelAndView.addObject("bcTTLDebitEntryAmount", "25.00");
		modelAndView.addObject("bcTTLCreditEntryAmount", "78.00");
		modelAndView.addObject("bcCompanyID", "741258964");
		modelAndView.addObject("fcEntryAddendaCount", "18");
		modelAndView.addObject("fcEntryHash", "0181800018");
		modelAndView.addObject("fcTTLDebitEntryAmount", "25.00");
		modelAndView.addObject("fcTTLCreditEntryAmount", "78.00");
		String displayString = testUnits.getCorrectString();
		modelAndView.addObject("displayString", displayString);
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/upload")
	public ModelAndView upload(Model model,@RequestParam("file") MultipartFile file) throws IOException
	{
		//ModelAndView modelAndView = new ModelAndView("uploadStatusView");
		ModelAndView modelAndView = null;
		modelAndView = new ModelAndView("uploadStatusView");
		System.out.println("/upload called");
		Path fileNameAndPath = Paths.get(getUploadDirectory(), file.getOriginalFilename());
		
		try {
			Files.write(fileNameAndPath,file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem with /upload in file 'FileUpload'");
		}
		VerifyMaster verifyMaster = new VerifyMaster(fileNameAndPath.toFile());
		modelAndView.addObject("immediateDestination", verifyMaster.displayInfo[0]);
		modelAndView.addObject("immediateOrigin", verifyMaster.displayInfo[1]);
		modelAndView.addObject("immediateOriginName", verifyMaster.displayInfo[2]);
		modelAndView.addObject("companyName", verifyMaster.displayInfo[3]);
		modelAndView.addObject("bhCompanyID", verifyMaster.displayInfo[4]);
		modelAndView.addObject("effectiveDate", verifyMaster.displayInfo[5]);
		modelAndView.addObject("bcEntryAddendaCount", verifyMaster.displayInfo[6]);
		modelAndView.addObject("bcEntryHash", verifyMaster.displayInfo[7]);
		modelAndView.addObject("bcTTLDebitEntryAmount", verifyMaster.displayInfo[8]);
		modelAndView.addObject("bcTTLCreditEntryAmount", verifyMaster.displayInfo[9]);
		modelAndView.addObject("bcCompanyID", verifyMaster.displayInfo[10]);
		modelAndView.addObject("fcEntryAddendaCount", verifyMaster.displayInfo[11]);
		modelAndView.addObject("fcEntryHash", verifyMaster.displayInfo[12]);
		modelAndView.addObject("fcTTLDebitEntryAmount", verifyMaster.displayInfo[13]);
		modelAndView.addObject("fcTTLCreditEntryAmount", verifyMaster.displayInfo[14]);
		modelAndView.addObject("displayString", verifyMaster.displayString);
		verifyMaster = null;
		return modelAndView;
		
	}
}

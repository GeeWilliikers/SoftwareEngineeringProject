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
	public getUploadDirectory getUploadDirectory = new getUploadDirectory();
	@RequestMapping(value="/")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		return new ModelAndView("home");
	}
//	public String getUploadDirectory()	{
//		String uploadDirectory = System.getProperty("user.dir").substring(0, System.getProperty("user.dir").length()-8)+"\\Project\\SemesterProject\\src\\main\\webapp\\resources\\uploads\\";		
//		return uploadDirectory;		
//	}
	
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
		modelAndView.addObject("boxErrors", new boolean[] {true, false, true, true, true, true, true, false, true, true, true, true, true, false, true});
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
		Path fileNameAndPath = Paths.get(getUploadDirectory.uploadDirectory, file.getOriginalFilename());
		
		try {
			Files.write(fileNameAndPath,file.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("problem with /upload in file 'FileUpload'");
		}
		System.out.println("before VerifyMaster initiation");
		VerifyMaster verifyMaster = new VerifyMaster(fileNameAndPath.toFile());
		System.out.println("verifyMaster initiation done");
		modelAndView.addObject("immediateDestination", verifyMaster.displayBoxes[0]);
		modelAndView.addObject("immediateOrigin", verifyMaster.displayBoxes[1]);
		modelAndView.addObject("immediateOriginName", verifyMaster.displayBoxes[2]);
		modelAndView.addObject("companyName", verifyMaster.displayBoxes[3]);
		modelAndView.addObject("bhCompanyID", verifyMaster.displayBoxes[4]);
		modelAndView.addObject("effectiveDate", verifyMaster.displayBoxes[5]);
		modelAndView.addObject("bcEntryAddendaCount", verifyMaster.displayBoxes[6]);
		modelAndView.addObject("bcEntryHash", verifyMaster.displayBoxes[7]);
		modelAndView.addObject("bcTTLDebitEntryAmount", verifyMaster.displayBoxes[8]);
		modelAndView.addObject("bcTTLCreditEntryAmount", verifyMaster.displayBoxes[9]);
		modelAndView.addObject("bcCompanyID", verifyMaster.displayBoxes[10]);
		modelAndView.addObject("fcEntryAddendaCount", verifyMaster.displayBoxes[11]);
		modelAndView.addObject("fcEntryHash", verifyMaster.displayBoxes[12]);
		modelAndView.addObject("fcTTLDebitEntryAmount", verifyMaster.displayBoxes[13]);
		modelAndView.addObject("fcTTLCreditEntryAmount", verifyMaster.displayBoxes[14]);
		modelAndView.addObject("displayString", verifyMaster.displayString);
		modelAndView.addObject("boxErrors", verifyMaster.displayBoxesCorrect);
		verifyMaster = null;
		return modelAndView;
		
	}
}

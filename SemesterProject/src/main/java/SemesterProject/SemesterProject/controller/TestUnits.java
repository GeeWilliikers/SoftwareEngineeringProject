package SemesterProject.SemesterProject.controller;

import java.io.File;
/*
 * Testing units. contains a function to return the string value of all files and the files themselves
 * Test units include:
 * correct amount (no errors)
 * hash error
 * amount error
 */
public class TestUnits {
	public static String correctTestString;
	public File correctTestFile;
	public String amountErrorTestString;
	public File amountErrorTestFile;
	public String hashErrorTestString;
	public File hashErrorTestFile;
	public TestUnits()	{
		correctTestString =  
				"101 10100001986753075211909150700A094101Testing1 Bank          THE FAB FOUR CORP              \r\n" + 
				"5220STRAWBERRYFIELDS                    8675307521PPDPAYROLL   191004191004   1101000010000001\r\n" + 
				"622101000019111111           00000000010200           JONES DESMOND           0101000010000001\r\n" + 
				"6321010000191234567890111213100000000021300           MUSTARD MISTER M        0101000010000002\r\n" + 
				"63210100001922334455667788   00000000032400           SKY LUCY D              0101000010000003\r\n" + 
				"622101000019899991456465654  00000000042680           LANE PENNY              0101000010000004\r\n" + 
				"6221010000198168085555911911 00000000052990           MCCARTNEY STELLA        0101000010000005\r\n" + 
				"6221010000196375309999911166600000000062110           RIGBY ELEANOR           0101000010000006\r\n" + 
				"6221010000196548921651651    00000000072330           KITE HENDERSON          0101000010000007\r\n" + 
				"63210100001911223344556      00000000082190           HAMMER MAXWELL          0101000010000008\r\n" + 
				"622101000019888999111000999  00000000092450           SHEARS WILLIAM          0101000010000009\r\n" + 
				"6221010000197722772277227722 00000000083450           DEAR PRUDENCE           0101000010000010\r\n" + 
				"622101000019062916062916     00000000076220           MARTIN LORETTA          0101000010000011\r\n" + 
				"6221010000198666166966       00000000062470           BEST PETE               0101000010000012\r\n" + 
				"632101000019331100331100     00000000056400           EASTMAN LINDA           0101000010000013\r\n" + 
				"6321010000198162663737       00000000042510           POWELL CYNTHIA          0101000010000014\r\n" + 
				"6221010000199988998899889    00000000037740           COX MARY                0101000010000015\r\n" + 
				"6221010000199876543219875455500000000022660           BOYD PATTIE             0101000010000016\r\n" + 
				"62210100001900001111111111   00000000012400           PEPPER SERGEANT         0101000010000017\r\n" + 
				"622101000019620001234        00000000020080           ROBERT DOCTOR           0101000010000018\r\n" + 
				"822000001801818000180000000000000000000000838675307521                         101000010000001\r\n" + 
				"9000001000003000000180181800018000000000000000000000083                                       \r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";

		amountErrorTestString = "101 10100001986753075211909150700A094101Testing1 Bank          THE FAB FOUR CORP              \r\n" + 
				"5220STRAWBERRYFIELDS                    8675307521PPDPAYROLL   191004191004   1101000010000001\r\n" + 
				"622101000019111111           00000000010200           JONES DESMOND           0101000010000001\r\n" + 
				"6321010000191234567890111213100000000021300           MUSTARD MISTER M        0101000010000002\r\n" + 
				"63210100001922334455667788   00000000032400           SKY LUCY D              0101000010000003\r\n" + 
				"622101000019899991456465654  00000000042680           LANE PENNY              0101000010000004\r\n" + 
				"6221010000198168085555911911 00000000052990           MCCARTNEY STELLA        0101000010000005\r\n" + 
				"6221010000196375309999911166600000000062110           RIGBY ELEANOR           0101000010000006\r\n" + 
				"6221010000196548921651651    00000000072330           KITE HENDERSON          0101000010000007\r\n" + 
				"63210100001911223344556      00000000082190           HAMMER MAXWELL          0101000010000008\r\n" + 
				"622101000019888999111000999  00000000092450           SHEARS WILLIAM          0101000010000009\r\n" + 
				"6221010000197722772277227722 00000000083450           DEAR PRUDENCE           0101000010000010\r\n" + 
				"622101000019062916062916     00000000076220           MARTIN LORETTA          0101000010000011\r\n" + 
				"6221010000198666166966       00000000062470           BEST PETE               0101000010000012\r\n" + 
				"632101000019331100331100     00000000056400           EASTMAN LINDA           0101000010000013\r\n" + 
				"6321010000198162663737       00000000042510           POWELL CYNTHIA          0101000010000014\r\n" + 
				"6221010000199988998899889    00000000037740           COX MARY                0101000010000015\r\n" + 
				"6221010000199876543219875455500000000022660           BOYD PATTIE             0101000010000016\r\n" + 
				"62210100001900001111111111   00000000012400           PEPPER SERGEANT         0101000010000017\r\n" + 
				"622101000019620001234        00000000020080           ROBERT DOCTOR           0101000010000018\r\n" + 
				"822000001801818000180000000000000000000000808675307521                         101000010000001\r\n" + 
				"9000001000003000000180181800018000000000000000000000083                                       \r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";

		hashErrorTestString = "101 10100001986753075211909150700A094101Testing1 Bank          THE FAB FOUR CORP              \r\n" + 
				"5220STRAWBERRYFIELDS                    8675307521PPDPAYROLL   191004191004   1101000010000001\r\n" + 
				"622101000019111111           00000000010200           JONES DESMOND           0101000010000001\r\n" + 
				"6321010000191234567890111213100000000021300           MUSTARD MISTER M        0101000010000002\r\n" + 
				"63210100001922334455667788   00000000032400           SKY LUCY D              0101000010000003\r\n" + 
				"622101000019899991456465654  00000000042680           LANE PENNY              0101000010000004\r\n" + 
				"6221010000198168085555911911 00000000052990           MCCARTNEY STELLA        0101000010000005\r\n" + 
				"6221010000196375309999911166600000000062110           RIGBY ELEANOR           0101000010000006\r\n" + 
				"6221010000196548921651651    00000000072330           KITE HENDERSON          0101000010000007\r\n" + 
				"63210100001911223344556      00000000082190           HAMMER MAXWELL          0101000010000008\r\n" + 
				"622101000019888999111000999  00000000092450           SHEARS WILLIAM          0101000010000009\r\n" + 
				"6221010000197722772277227722 00000000083450           DEAR PRUDENCE           0101000010000010\r\n" + 
				"622101000019062916062916     00000000076220           MARTIN LORETTA          0101000010000011\r\n" + 
				"6221010000198666166966       00000000062470           BEST PETE               0101000010000012\r\n" + 
				"632101000019331100331100     00000000056400           EASTMAN LINDA           0101000010000013\r\n" + 
				"6321010000198162663737       00000000042510           POWELL CYNTHIA          0101000010000014\r\n" + 
				"6221010000199988998899889    00000000037740           COX MARY                0101000010000015\r\n" + 
				"6221010000199876543219875455500000000022660           BOYD PATTIE             0101000010000016\r\n" + 
				"62210100001900001111111111   00000000012400           PEPPER SERGEANT         0101000010000017\r\n" + 
				"622101000019620001234        00000000020080           ROBERT DOCTOR           0101000010000018\r\n" + 
				"822000001801818000110000000000000000000000838675307521                         101000010000001\r\n" + 
				"9000001000003000000180181800011000000000000000000000083                                       \r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999\r\n" + 
				"9999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";
		hashErrorTestFile = new File("NACHA Test File - HASH ERROR.txt");
		amountErrorTestFile = new File("NACHA Test File - $-AMOUNT ERROR.txt");
		correctTestFile = new File("NACHA Test File - NO ERROR.txt");
	}
	
	public String getAmountErrorString()	{
		return amountErrorTestString;
	}
	public String getHashErrorString()	{
		return hashErrorTestString;
	}
	public String getCorrectString()	{
		return correctTestString;
	}
	public File getAmountErrorFile()	{
		return amountErrorTestFile;
	}
	public File getHashErrorFile()	{
		return hashErrorTestFile;
	}
	public File getCorrectFile()	{
		return correctTestFile;
	}
}

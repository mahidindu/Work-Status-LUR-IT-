package LURProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WORKSTATUS {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();	
		
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/dashboard.html");
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	   
		driver.findElement(By.xpath("//select[@id='calendarInterval']")).click();
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//nav[@id=\"sidebar\"]//div//ul[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Screenshot']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Apps']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Urls']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//span[text()='View Timesheet']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Approve Timesheet']")).click();
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Attedence.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Member.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Teams.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/project.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/todo.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/client.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/JobSites.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Schedule.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/timeoff.html");
		Thread.sleep(2000);
		
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/time&activity.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Weekly.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Dynamicreport.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/report.html");
		Thread.sleep(2000);
		
		
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/general.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/feature.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Subscription.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Organization.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/allsettings.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/intigration.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/changelog.html");
		Thread.sleep(2000);
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Helpdesk.html");
		Thread.sleep(2000);
		
		
		
		driver.findElement(By.xpath("//span[text()='Dashboard']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Me']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='All']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='view all screenshots']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='view project']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/URL.html");
		Thread.sleep(2000);
		
		 driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='view apps']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='view Timesheets']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='view To-Dos']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//span[text()='Screenshot']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@class='box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT01']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT02']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT03']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT04']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//option[text()='EMURIT05']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT06']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT07']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@style='height: 30px; border-radius: 20px; width: 100px;']")).click();
		Thread.sleep(2000);
		 
		// IN SCREEN SHORT PAGE CALANDER NOT WORKING IN AUTOMATION FOR CHANGES DATE //
		
		driver.findElement(By.xpath("//span[text()='Apps']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@class='box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@class='box']//option[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT02']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT03']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT04']")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//option[text()='EMURIT05']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT06']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT07']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("DINESH");
		Thread.sleep(2000);
		
		// IN APPS PAGE CALANDER NOT WORKING IN AUTOMATION FOR CHANGES DATE //
		
		driver.findElement(By.xpath("//span[text()='Urls']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@class='box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT01']")).click();
		Thread.sleep(2000);
		
		// IN URLS CALANDER NOT WORKING IN AUTOMATION FOR CHANGES DATE //
		
		driver.findElement(By.xpath("//a[text()='https://www.python.org']")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(2000);
		
		/*
		
		//URLS NOT WOTRKING
		driver.findElement(By.xpath("https://www.javatpoint.com/python-tutorial")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		//driver.findElement(By.xpath("https://www.w3schools.com/python")).click();
		Thread.sleep(2000);
		
		//driver.navigate().back();
		
		//driver.findElement(By.xpath("https://www.programiz.com/python-programming/online-compiler")).click();
		Thread.sleep(2000);
		
		//driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.javatpoint.com")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.geeksforgeeks.org/software-testing-tools/")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.youtube.com")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.w3schools.com/python")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.w3schools.com/python")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.w3schools.com")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("LUR-IT-BUSINESS-SOLUTIONS-OPC-PRIVATELIMITED")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.udemy.com/course/java-tutorial/")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.w3schools.com/python")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.codecademy.com/learn/learn-java")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.w3schools.com/python")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("https://www.programiz.com/java-programming")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		*/
		
		
		driver.findElement(By.xpath("//span[text()='View Timesheet']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@class='box']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[text()='EMURIT01']")).click();
		Thread.sleep(2000);
		
		// IN VIEW TIMESHEETS CALANDER NOT WORKING IN AUTOMATION FOR CHANGES DATE //
		
		driver.findElement(By.xpath("//span[text()='Approve Timesheet']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("DINESH");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("LUR 012");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Navya");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='search']")).clear();
		Thread.sleep(2000);
		
		
		
		driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Attedence.html");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tr[1]//button/a")).click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.findElement(By.xpath("//select[@id='date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Daily']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Weekly']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Monthly']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Yearly']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='name']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Mahesh']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Balakrishna']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Naveen']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Navya']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='date']")).click();
		Thread.sleep(2000);
		
		// IN ATTENDENCE PAGE CALANDER IS NOT WORKING AND NO SEARCH BUTTON 
		
		driver.findElement(By.xpath("//tr[1]//button/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//select[@id='date']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Daily']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Weekly']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Monthly']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//option[.='Yearly']")).click();
		Thread.sleep(2000);
		
		// IN EMPLOYES ATTENDENCE PAGE CALANDER IS NOT WORKING AND IT WILL NOT NAVIGATE TO ANOTHER PAGE DIRECTELY .
		
	     driver.navigate().back();
		
	     driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Member.html");
		 Thread.sleep(2000);
		
		 // IN THIS MEMBER PAGE PRESENT NO FUNCTIONALITY IS NOT THERE BECAUSE  BACKENEND IS IN PROCCESING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Teams.html");
		 Thread.sleep(2000);
		 
		 // IN THIS TEAMS PAGE PRESENT NO FUNCTIONALITY IS NOT THERE BECAUSE  BACKENEND IS IN PROCCESING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/project.html");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='ALL PROJECTS']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='YET TO START']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='IN PROGRESS']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='ON HOLD']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='COMPLETED']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='ARCHIVED']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[.='CANCELLED']")).click();
		 Thread.sleep(2000);
		 
		 // IN PROJECTS PAGE FILTERS AND CHECKBOX NOT PROPERLY AND STATUS 
		 //DROUPDOWN NOT WORKING PROPERLY AND NO FUNCTIONALITY BECAUSE BACKEND IS IN PROCCESING 
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/todo.html");
		 Thread.sleep(2000);
		 
		 // IN TO-DOS PAGE ALIGNMENT  IS NOT PROPELY AND NO FUNCTIONALITY BECAUSE BACKEND IS IN PROCCESSING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/client.html");
		 Thread.sleep(2000);
		 
		// IN  CLIENT PAGE ACTIVE SECTION  ALIGNMENT  IS NOT PROPELY AND NO FUNCTIONALITY BECAUSE BACKEND IS IN PROCCESSING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/JobSites.html");
		 Thread.sleep(2000);
		 
		// IN  JOB SITE   ALIGNMENT  IS NOT PROPELY AND NO FUNCTIONALITY BECAUSE BACKEND IS IN PROCCESSING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Schedule.html");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//select[@id='date']")).click();
		 Thread.sleep(2000);
			
		 driver.findElement(By.xpath("//option[.='Weekly']")).click();
		 Thread.sleep(2000);
			
		 driver.findElement(By.xpath("//option[.='Monthly']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//select [@id='name']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option [.='Gowri']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option [.='Akhil']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option [.='Manisha']")).click();
		 Thread.sleep(2000);
		 
		 //IN SCHEDULES PAGE CALANDER IS NOT WORKING 
		 
		 driver.findElement(By.xpath("//input[@id='employeeName']")).sendKeys("DINESH");
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//select[@id='leaveType']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[@value='personal']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[@value='sick']")).click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//option[@value='vacation']")).click();
		 Thread.sleep(2000);
		 
		 // IN THE SCHEDULES PAGE START AND END DATE CALANDER IS NOT WORKING AND NO FUNCTIONALITY BEACUSE BACKEND IS NOT WORKING 
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/timeoff.html");
		 Thread.sleep(2000);
		 
		 //IN TIME-OFF PAGE  FUNCTIONALITY ARE NOT THERE BECAUSE BACKEND IS IN PROCCESING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/time&activity.html");
		 Thread.sleep(2000);
		 
		 //IN TIMES-ACTIVITY PAGE  FUNCTIONALITY ARE NOT THERE BECAUSE BACKEND IS IN PROCCESING
		 
		 driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Weekly.html");
			Thread.sleep(2000);
			
			 //IN WEEKLY PAGE  FUNCTIONALITY ARE NOT THERE BECAUSE BACKEND IS IN PROCCESING
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Dynamicreport.html");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//select[@name='cars']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value='volvo']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value='saab']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value='opel']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//option[@value='audi']")).click();
			Thread.sleep(2000);
		
			driver.findElement(By.xpath("//div[2]/div[1]/input[1]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[2]/div[1]/input[2]")).click();
			Thread.sleep(2000);
			
			
			 //IN DYNAMICREPORT PAGE CALANDER IS NOT WORKING AND  FUNCTIONALITY ARE NOT THERE BECAUSE BACKEND IS IN PROCCESING
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/report.html");
			Thread.sleep(2000);
			
			 //IN ALL REPORT PAGE  FUNCTIONALITY ARE NOT THERE BECAUSE BACKEND IS IN PROCCESING
		 
			//IN THE SEETING PAGE NO FUNCTIONALITY ARE NOT THERE BECAUSE OF BACKEND IS IN PROCCESSING
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/general.html");
			Thread.sleep(2000);
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/feature.html");
			Thread.sleep(2000);
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Subscription.html");
			Thread.sleep(2000);
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Organization.html");
			Thread.sleep(2000);
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/allsettings.html");
			Thread.sleep(2000);
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/intigration.html");
			Thread.sleep(2000);
		 
			// Documentation PAGE NO FUNCTIONALITY ARE NOT THERE BECAUSE OF BACKEND IS IN PROCCESSING
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/changelog.html");
			Thread.sleep(2000);
			
			driver.get("https://lurit-ets.s3.ap-south-1.amazonaws.com/LURIT_ETS/Helpdesk.html");
			Thread.sleep(2000);
		 
			driver.findElement(By.xpath("//input[@placeholder='Enter your name']")).sendKeys("DINESH");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys("DINESH2303@GMAIL.COM");
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[.='Privacy Policy']")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//a[.='Terms of Service']")).click();
			Thread.sleep(2000);
			
			driver.navigate().back();
			
			driver.findElement(By.xpath("//a[.='Report a Bug']")).click();
			Thread.sleep(2000);
		 
			driver.navigate().back();
			
			driver.findElement(By.xpath("//a[.='Suggest a Features']")).click();
			Thread.sleep(2000);
		 
			driver.navigate().back();
			
			
			
			
			
	}

}

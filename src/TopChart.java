import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class TopChart {
	

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/pragyajha/Downloads/chromedriver");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) dr;
		
		dr.get("https://play.google.com/store/apps/top");
		System.out.println(dr.getTitle());
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//1st App in Top Free of Top Charts List
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.kwai.bulldog\"]")).click();
		
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.kwai.bulldog");
		String AppName1 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName1);
		String Rating1 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating1 = Rating1.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating1);
		
		int R1 = Integer.parseInt(Rating1);
		
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
		
		String Date1 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date1);
		
		DateTimeFormatter D1 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated1 = LocalDate.parse(Date1, D1);
		//System.out.println(Updated);
		
		LocalDate Today =  java.time.LocalDate.now();
		//System.out.println(Today);
		
		long LastUpdated1  = ChronoUnit.DAYS.between(Updated1, Today);
		//System.out.println(LastUpdated);
		
		float Score1 = R1/LastUpdated1;
		System.out.println("Score of the app:"+ " " +Score1);
		
		//2nd App in Top Free of Top Charts List
		dr.navigate().back();
		
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.google.android.apps.meetings\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.google.android.apps.meetings");
		String AppName2 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName2);
		String Rating2 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating2 = Rating2.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating2);
		
		int R2 = Integer.parseInt(Rating2);
		
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
		
		String Date2 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date2);
		
		DateTimeFormatter D2 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated2 = LocalDate.parse(Date2, D2);
		
		long LastUpdated2  = ChronoUnit.DAYS.between(Updated2, Today);
		
		float Score2 = R2/LastUpdated2;
		System.out.println("Score of the app:"+ " " +Score2);
		
		//3rd App in Top Free of Top Charts List
		dr.navigate().back();
		
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.eterno.shortvideos\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.eterno.shortvideos");
		String AppName3 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName3);
		String Rating3 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating3 = Rating3.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating3);
		
		int R3 = Integer.parseInt(Rating3);
		
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
		
		String Date3 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date3);
		
		DateTimeFormatter D3 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated3 = LocalDate.parse(Date3, D3);
		
		long LastUpdated3  = ChronoUnit.DAYS.between(Updated3, Today);
		
		float Score3 = R3/LastUpdated3;
		System.out.println("Score of the app:"+ " " +Score3);
		
		//4th App in Top Free of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.next.innovation.takatak\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.next.innovation.takatak");
		String AppName4 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName4);
		String Rating4 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating4 = Rating4.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating4);
		
		int R4 = Integer.parseInt(Rating4);
		
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
		
		String Date4 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date4);
		
		DateTimeFormatter D4 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated4 = LocalDate.parse(Date4, D4);
		
		long LastUpdated4  = ChronoUnit.DAYS.between(Updated4, Today);
		
		float Score4 = R4/LastUpdated4;
		System.out.println("Score of the app:"+ " " +Score4);
		
		
		//5th App in Top Free of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.instagram.android\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.instagram.android");
		String AppName5 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName5);
		String Rating5 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating5 = Rating5.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating5);
				
		int R5 = Integer.parseInt(Rating5);
				
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
				
		String Date5 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date5);
				
		DateTimeFormatter D5 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated5 = LocalDate.parse(Date5, D5);
					
		long LastUpdated5  = ChronoUnit.DAYS.between(Updated5, Today);
		
		long Score5 = R5/LastUpdated5;
		System.out.println("Score of the app:"+ " " +Score5);
		
		
		//6th App in Top Free of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=us.zoom.videomeetings\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=us.zoom.videomeetings");
		String AppName6 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName6);
		String Rating6 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating6 = Rating6.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating6);
						
		int R6 = Integer.parseInt(Rating6);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date6 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date6);
						
		DateTimeFormatter D6 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated6 = LocalDate.parse(Date6, D6);
							
		long LastUpdated6  = ChronoUnit.DAYS.between(Updated6, Today);
				
		float Score6 = R6/LastUpdated6;
		System.out.println("Score of the app:"+ " " +Score6);
		
		
		//1st App in Top Paid Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=anybooks.book.pdf.epub.txt\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=anybooks.book.pdf.epub.txt");
		String AppName7 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName7);
		String Rating7 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating7 = Rating7.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating7);
						
		int R7 = Integer.parseInt(Rating7);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date7 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[2]")).getText();
		System.out.println("Last Updated date:"+ " " +Date7);
						
		DateTimeFormatter D7 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated7 = LocalDate.parse(Date7, D7);
							
		long LastUpdated7  = ChronoUnit.DAYS.between(Updated7, Today);
				
		float Score7 = R7/LastUpdated7;
		System.out.println("Score of the app:"+ " " +Score7);
		
		
		//2nd App in Top Paid Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.music.ultimatebrainbooster\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.music.ultimatebrainbooster");
		String AppName8 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName8);
		String Rating8 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating8 = Rating8.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating8);
						
		int R8 = Integer.parseInt(Rating8);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date8 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[2]")).getText();
		System.out.println("Last Updated date:"+ " " +Date8);
						
		DateTimeFormatter D8 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated8 = LocalDate.parse(Date8, D8);
							
		long LastUpdated8  = ChronoUnit.DAYS.between(Updated8, Today);
				
		float Score8 = R8/LastUpdated8;
		System.out.println("Score of the app:"+ " " +Score8);
		
		
		//3rd App in Top Paid Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.maxmpz.audioplayer.unlock\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.maxmpz.audioplayer.unlock");
		String AppName9 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName9);
		String Rating9 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating9 = Rating9.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating9);
						
		int R9 = Integer.parseInt(Rating9);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date9 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[2]")).getText();
		System.out.println("Last Updated date:"+ " " +Date9);
						
		DateTimeFormatter D9 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated9 = LocalDate.parse(Date9, D9);
							
		long LastUpdated9  = ChronoUnit.DAYS.between(Updated9, Today);
				
		float Score9 = R9/LastUpdated9;
		System.out.println("Score of the app:"+ " " +Score9);	
		
		
		//4th App in Top Paid Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.g19mobile.gameboosterplus\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.g19mobile.gameboosterplus");
		String AppName10 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName10);
		String Rating10 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating10 = Rating10.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating10);
						
		int R10 = Integer.parseInt(Rating10);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date10 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[2]")).getText();
		System.out.println("Last Updated date:"+ " " +Date10);
						
		DateTimeFormatter D10 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated10 = LocalDate.parse(Date10, D10);
							
		long LastUpdated10  = ChronoUnit.DAYS.between(Updated10, Today);
				
		float Score10 = R10/LastUpdated10;
		System.out.println("Score of the app:"+ " " +Score10);
		
		
		
		//5th App in Top Paid Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.designed4you.armoni\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.designed4you.armoni");
		String AppName11 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName11);
		String Rating11 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating11 = Rating11.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating11);
						
		int R11 = Integer.parseInt(Rating11);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date11 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[2]")).getText();
		System.out.println("Last Updated date:"+ " " +Date11);
						
		DateTimeFormatter D11 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated11 = LocalDate.parse(Date11, D11);
							
		long LastUpdated11  = ChronoUnit.DAYS.between(Updated11, Today);
				
		float Score11 = R11/LastUpdated11;
		System.out.println("Score of the app:"+ " " +Score11);
		
		
		//6th App in Top Paid Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=org.kustom.widget.pro\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=org.kustom.widget.pro");
		String AppName12 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName12);
		String Rating12 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating12 = Rating12.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating12);
						
		int R12 = Integer.parseInt(Rating12);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date12 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[2]")).getText();
		System.out.println("Last Updated date:"+ " " +Date12);
						
		DateTimeFormatter D12 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated12 = LocalDate.parse(Date12, D12);
							
		long LastUpdated12  = ChronoUnit.DAYS.between(Updated12, Today);
				
		float Score12 = R12/LastUpdated12;
		System.out.println("Score of the app:"+ " " +Score12);
		
		
		//1st App in Top Grossing Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.hkfuliao.chamet\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.hkfuliao.chamet");
		String AppName13 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName13);
		String Rating13 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating13 = Rating13.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating13);
						
		int R13 = Integer.parseInt(Rating13);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date13 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date13);
						
		DateTimeFormatter D13 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated13 = LocalDate.parse(Date13, D13);
							
		long LastUpdated13  = ChronoUnit.DAYS.between(Updated13, Today);
				
		float Score13 = R13/LastUpdated13;
		System.out.println("Score of the app:"+ " " +Score13);
		
		
		//2nd App in Top Grossing Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.google.android.apps.subscriptions.red\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.google.android.apps.subscriptions.red");
		String AppName14 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName14);
		String Rating14 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating14 = Rating14.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating14);
						
		int R14 = Integer.parseInt(Rating14);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date14 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date14);
						
		DateTimeFormatter D14 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated14 = LocalDate.parse(Date14, D14);
							
		long LastUpdated14  = ChronoUnit.DAYS.between(Updated14, Today);
				
		float Score14 = R14/LastUpdated14;
		System.out.println("Score of the app:"+ " " +Score14);
		
		
		//3rd App in Top Grossing Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.sgiggle.production\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.sgiggle.production");
		String AppName15 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName15);
		String Rating15 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating15 = Rating15.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating15);
						
		int R15 = Integer.parseInt(Rating15);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date15 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date15);
						
		DateTimeFormatter D15 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated15 = LocalDate.parse(Date15, D15);
							
		long LastUpdated15  = ChronoUnit.DAYS.between(Updated15, Today);
				
		float Score15 = R15/LastUpdated15;
		System.out.println("Score of the app:"+ " " +Score15);
		
		
		//4th App in Top Grossing Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.parau.videochat\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.parau.videochat");
		String AppName16 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName16);
		String Rating16 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating16 = Rating16.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating16);
						
		int R16 = Integer.parseInt(Rating16);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date16 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date16);
						
		DateTimeFormatter D16 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated16 = LocalDate.parse(Date16, D16);
							
		long LastUpdated16  = ChronoUnit.DAYS.between(Updated16, Today);
				
		float Score16 = R16/LastUpdated16;
		System.out.println("Score of the app:"+ " " +Score16);
		
		
		//5th App in Top Grossing Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.truecaller\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.truecaller");
		String AppName17 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName17);
		String Rating17 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating17 = Rating17.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating17);
						
		int R17 = Integer.parseInt(Rating17);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date17 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date17);
						
		DateTimeFormatter D17 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated17 = LocalDate.parse(Date17, D17);
							
		long LastUpdated17  = ChronoUnit.DAYS.between(Updated17, Today);
				
		float Score17 = R17/LastUpdated17;
		System.out.println("Score of the app:"+ " " +Score17);
		
		
		//6th App in Top Grossing Category of Top Charts List
		dr.navigate().back();
		dr.findElement(By.xpath("//a[@href=\"/store/apps/details?id=com.parau.pro.videochat\"]")).click();
		dr.navigate().to("https://play.google.com/store/apps/details?id=com.parau.pro.videochat");
		String AppName18 = dr.findElement(By.xpath("//h1[@class = \"AHFaub\"]")).getText();
		System.out.println("Name of Application:"+ " " +AppName18);
		String Rating18 = dr.findElement(By.xpath("//span[@class=\"AYi5wd TBRnV\"]")).getText();
		Rating18 = Rating18.replaceAll(",", "");
		System.out.println("Number of Reviews of the application:"+ " " +Rating18);
						
		int R18 = Integer.parseInt(Rating18);
						
		js.executeScript("arguments[0].scrollIntoView();", dr.findElement(By.xpath("(//h2[@class='Rm6Gwb'])[2]")));
						
		String Date18 = dr.findElement(By.xpath("(//div[@class = \"IQ1z0d\"])[1]")).getText();
		System.out.println("Last Updated date:"+ " " +Date18);
						
		DateTimeFormatter D18 = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate Updated18 = LocalDate.parse(Date18, D18);
							
		long LastUpdated18  = ChronoUnit.DAYS.between(Updated18, Today);
				
		float Score18 = R18/LastUpdated18;
		System.out.println("Score of the app:"+ " " +Score18);
		
		
		dr.quit();
		
	}

}

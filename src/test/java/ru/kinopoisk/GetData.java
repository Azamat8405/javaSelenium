package ru.kinopoisk;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.net.*;
import java.util.List;
import java.util.ListIterator;

public class GetData {
    @Test
    public void getData() {

        try {

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_83\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();


            driver.get("https://www.instagram.com/");
            Thread.sleep(4000);

            WebElement username = driver.findElementByName("username");
            username.sendKeys("89858191953");

            WebElement password = driver.findElementByName("password");
            password.sendKeys("Hy65tgbvfr4");

            password.submit();

            Thread.sleep(3000);
            driver.get("https://www.instagram.com/ussr_our_homeland/");

            Thread.sleep(3000);

            URL connection = new URL("https://scontent-arn2-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/c42.0.703.703a/s640x640/104474119_160587215657530_4854790570061227581_n.jpg?_nc_ht=scontent-arn2-1.cdninstagram.com&_nc_cat=110&_nc_ohc=i1JuxpBQCHsAX_mvrDX&oh=b0e1838eb79b9fe830e54a6447e9e641&oe=5F18A3A7");
            HttpURLConnection urlconn;
            urlconn = (HttpURLConnection) connection.openConnection();
            urlconn.setRequestMethod("GET");
            urlconn.connect();
            InputStream in = null;
            in = urlconn.getInputStream();


            File file = new File("C:\\Users\\azamat\\Desktop\\test.jpg");

//            if(!file.exists()) {
//                //Создаем его.
//                file.createNewFile();
//            }

            OutputStream writer = new FileOutputStream(file);
            byte buffer[] = new byte[1];
            int c = in.read(buffer);
            while (c > 0) {
                writer.write(buffer, 0, c);
                c = in.read(buffer);
            }
            writer.flush();
            writer.close();
            in.close();
            // https://scontent-arn2-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/c42.0.703.703a/s640x640/104474119_160587215657530_4854790570061227581_n.jpg?_nc_ht=scontent-arn2-1.cdninstagram.com&_nc_cat=110&_nc_ohc=i1JuxpBQCHsAX_mvrDX&oh=b0e1838eb79b9fe830e54a6447e9e641&oe=5F18A3A7


//            RemoteWebElement element= ((RemoteWebElement) driver.switchTo().defaultContent().findElement(yourElement));
//            File temp = driver.getScreenshotAs(OutputType.FILE);
//            Point point = element.getCoordinates().inViewPort();
//            Dimension size = element.getSize();
//            try {
//                BufferedImage image = ImageIO.read(temp);
//                return image.getSubimage(point.getX(), point.getY(), size.getWidth(), size.getHeight());
//            } catch (IOException io) {
//                System.out.println("Can't read screenshot in buffer");
//                return null;
//            }


//            List<String> profileDirs = Lists.newArrayList("anonymous*webdriver-profile",
//                    "userprofile*copy", "seleniumSslSupport*");
//            File tmpDir = new File(System.getProperty("java.io.tmpdir"));
//            FilenameFilter profileDirsFilter = new WildcardFileFilter(profileDirs);
//            List<File> files = new ArrayList<>();
//            files.addAll(Arrays.asList(tmpDir.listFiles(profileDirsFilter)));
//            WebDriver driver = new FirefoxDriver();
//            List<File> files1 = new ArrayList<>();
//            files1.addAll(Arrays.asList(tmpDir.listFiles(profileDirsFilter)));
//            files1.removeAll(files);
//            System.out.print(files1.get(0)); //temp folder



//            for(int i = 1071034; i <= 1100000; i++ ){
//
//                Thread.sleep(4000); // 5 секунд
//
//                driver.get("https://www.kinopoisk.ru/film/" + i + "/");
//                String str = driver.getPageSource();
//                if(str.contains("404. Страница не найден"))
//                {
//                    continue;
//                }
//
//                if(str.contains("Нет подключения к Интернету")){
//                    i--;
//                    continue;
//                }
//                FileWriter wr = new FileWriter("C:\\Users\\azamat\\Desktop\\films\\film"+i+".txt");
//                wr.write(str);
//                wr.close();
//            }

        }catch(Exception e){
            System.out.println(e.getMessage());

        }

        // ================



//        try {
//    //        driver.get("https://www.kinopoisk.ru/top/lists/type/11/");
//            String[] links = new String[100];
////            links[0] = "https://www.kinopoisk.ru/lists/navigator/country-13/";
////            links[1] = "https://www.kinopoisk.ru/lists/navigator/country-1/";
//    //        links[2] = "https://www.kinopoisk.ru/lists/navigator/comedy/country-2/";
//    //        links[3] = "https://www.kinopoisk.ru/lists/navigator/animation/country-13/";
//    //        links[4] = "https://www.kinopoisk.ru/lists/navigator/animation/";
//    //        links[5] = "https://www.kinopoisk.ru/lists/navigator/animation/2019/";
//    //        links[6] = "https://www.kinopoisk.ru/lists/navigator/animation/2018/";
//    //        links[7] = "https://www.kinopoisk.ru/lists/navigator/country-2/";
//    //        links[8] = "https://www.kinopoisk.ru/lists/navigator/2019/country-2/";
//    //        links[9] = "https://www.kinopoisk.ru/lists/navigator/2018/country-2/";
//    //        links[10] = "https://www.kinopoisk.ru/lists/navigator/comedy/";
//    //        links[11] = "https://www.kinopoisk.ru/lists/navigator/comedy/2019/";
//    //        links[12] = "https://www.kinopoisk.ru/lists/navigator/comedy/2018/";
//    //        links[13] = "https://www.kinopoisk.ru/lists/navigator/romance/";
//    //        links[14] = "https://www.kinopoisk.ru/lists/navigator/romance/2019/";
//    //        links[15] = "https://www.kinopoisk.ru/lists/navigator/romance/2018/";
//    //        links[16] = "https://www.kinopoisk.ru/lists/navigator/romance/country-2/";
//    //        links[17] = "https://www.kinopoisk.ru/lists/navigator/romance/2019/country-2/";
//    //        links[18] = "https://www.kinopoisk.ru/lists/navigator/romance/2018/country-2/";
//    //        links[19] = "https://www.kinopoisk.ru/lists/navigator/horror/";
//    //        links[20] = "https://www.kinopoisk.ru/lists/navigator/horror/2019/";
//    //        links[21] = "https://www.kinopoisk.ru/lists/navigator/horror/2019/";
//    //        links[22] = "https://www.kinopoisk.ru/lists/navigator/action/";
//    //        links[23] = "https://www.kinopoisk.ru/lists/navigator/action/country-2/";
//    //        links[24] = "https://www.kinopoisk.ru/lists/navigator/action/2019/";
//    //        links[25] = "https://www.kinopoisk.ru/lists/navigator/action/2018/";
//    //        links[26] = "https://www.kinopoisk.ru/lists/navigator/sci-fi/";
//    //        links[27] = "https://www.kinopoisk.ru/lists/navigator/sci-fi/2019/";
//    //        links[28] = "https://www.kinopoisk.ru/lists/navigator/sci-fi/2018/";
//    //        links[29] = "https://www.kinopoisk.ru/lists/navigator/thriller/";
//    //        links[30] = "https://www.kinopoisk.ru/lists/navigator/thriller/2019/";
//    //        links[31] = "https://www.kinopoisk.ru/lists/navigator/thriller/2018/";
//    //        links[32] = "https://www.kinopoisk.ru/lists/navigator/mystery/";
//
//            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_75\\chromedriver.exe");
//            ChromeDriver driver = new ChromeDriver();
//
//            int maxPages = 1;
//            int curPage = 1;
//            int janr = 1;
//            // прходим по жанрам
//            for(String str_link : links){
//
//                FileWriter wr = new FileWriter("C:\\Users\\azamat\\Desktop\\films\\filmLinksList"+janr+".txt");
//                janr++;
//
//                Thread.sleep(20000); // 20 секунд
//
//                // качаем страницу со списком  фильмов по жанру
//                driver.get(str_link + "?page=" + curPage + "&sort=votes");
//
//                System.out.println(str_link + "?page=" + curPage + "&sort=votes");
//
////                System.out.println(driver.getPageSource());
//
//                List<WebElement> els =  driver.findElements(By.tagName("a") );
//                for(WebElement e : els) {
//
//                    String class_atr = e.getAttribute("class");
//                    if(class_atr.equals("selection-film-item-meta__link"))
//                    {
//                        wr.write(e.getAttribute("href") + "\r\n");
////                        System.out.println(e.getAttribute("href") );
//                    }
//                }
//
//                WebElement lastPage = driver.findElementByXPath("//a[@class='paginator__page-number'][6]");
//                maxPages = Integer.parseInt(lastPage.getText());
//
//                //  идем по всем страницам
//                for(int i = 0; i <= maxPages; i++)
//                {
//                    curPage++;
//                    Thread.sleep(7000); // 7 секунд
//
//                    // качаем страницу со списком  фильмов по жанру
//                    driver.get(str_link + "?page=" + curPage + "&sort=votes");
//                    System.out.println( str_link + "?page=" + curPage + "&sort=votes" );
//
//                    List<WebElement> els1 =  driver.findElements(By.tagName("a") );
//                    for(WebElement e : els1) {
//
//                        String class_atr = e.getAttribute("class");
//                        if(class_atr.equals("selection-film-item-meta__link"))
//                        {
//                            wr.write(e.getAttribute("href") + "\r\n");
////                            System.out.println(e.getAttribute("href") );
//                        }
//                    }
//
//                    if(i > 10){
//                        break;
//                    }
//
//                    if(curPage > maxPages){
//                        break;
//                    }
//                }
//
//                wr.close();
////System.exit(0);
//
//            }
//
//
//        }catch(Exception e){
//            System.out.println(e.getMessage());
//            System.exit(0);
//        }
    }
}

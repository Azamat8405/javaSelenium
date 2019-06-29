package ru.kinopoisk;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.*;
import java.util.List;
import java.util.ListIterator;

public class GetData {
    @Test
    public void getData() {

        try {

            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32_75\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();

            for(int i = 3885; i <= 354000; i++ ){

//                if(i > 00){
//                    break;
//                }
//                if(i%50 == 0){
//                    Thread.sleep(60000); // 60 секунд
//                }
//                if(i%100 == 0){
//                    Thread.sleep(240000); // 240 секунд
//                }
//                if(i%502 == 0){
//                    Thread.sleep(500000); // 240 секунд
//                }

                Thread.sleep(4500); // 5 секунд

                driver.get("https://www.kinopoisk.ru/film/" + i + "/");
                String str = driver.getPageSource();
                if(str.contains("404. Страница не найден"))
                {
                    continue;
                }

                if(str.contains("Нет подключения к Интернету")){
                    i--;
                    continue;
                }
                FileWriter wr = new FileWriter("C:\\Users\\azamat\\Desktop\\films\\film"+i+".txt");
                wr.write(str);
                wr.close();
            }

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

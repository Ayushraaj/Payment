package com.Primary_Qualifier_TWO.Primary_Qualifier_TWO;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.AppConfig.AppConfig;
import com.NetflixService.NetflixService;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ap = new AnnotationConfigApplicationContext(AppConfig.class);
        
        NetflixService np = ap.getBean(NetflixService.class);
        np.AboutPrimeUser();
        //np.NonPrimeUser();
        
    }
}

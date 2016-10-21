package appstack.apps;

import java.lang.reflect.Method;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import java.util.TimeZone;

/**
 * Created by berk (zouzhberk@163.com)) on 10/21/16.
 */
public class ApplicationManager
{


    public static void main(String[] args)
    {
        try
        {
            new ApplicationManager().run(args);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void run(String... args)
    {
        ProtectionDomain domain = ApplicationManager.class.getProtectionDomain();
        CodeSource source = domain.getCodeSource();
        System.out.println(source.getLocation());

//        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//
        setupHome();
//
//        try {
//            ClassLoader cl = getClassLoader();
//
//            Thread.currentThread().setContextClassLoader(cl);
//
//            Class<?> mainClass = cl.loadClass(getMain());
//            Method mainMethod = mainClass.getMethod("main", String[].class);
//
//            mainMethod.invoke(null, (Object) args);
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.exit(1);
//        }

    }
    Configuration config;

    private void setupHome()
    {
        //TODO:: load all drivers jars

        // TODO:: register default stack enviroments from configuration file.



    }
}

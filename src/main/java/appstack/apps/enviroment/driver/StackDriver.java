package appstack.apps.enviroment.driver;

/**
 * Created by berk (zouzhberk@163.com)) on 10/20/16.
 */
public interface StackDriver
{
    public String getName();


    public StackProvider getStackProvider(DriverConfig config);

}

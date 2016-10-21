package appstack.apps.enviroment.driver;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Stack;

/**
 * Created by berk (zouzhberk@163.com)) on 10/20/16.
 */
public interface StackProvider
{
    public Stack getStack(String id);

    /**
     * create and start  a new  app stack.
     * @param config
     * @return
     */
    public Stack deploy(String appName, Map<String,byte[]> stackFiles, Properties config);

    public Stack stop(String id);

    public Stack start(String id);

    public void destroy(String id);

    public Stack redeploy(Map<String,Object> config,AllocatedPolicy policy);

    public List<Stack> list(ListStackOptions options);
}

package appstack.apps.api;

import appstack.apps.api.view.EnviromentView;
import appstack.apps.api.view.EnviromentConfig;
import appstack.apps.api.view.StackDriverView;

/**
 * Created by berk (zouzhberk@163.com)) on 10/21/16.
 */
public interface EnviromentService
{
    public EnviromentView register(String envName, StackDriverView driver, EnviromentConfig config);

    public EnviromentView update(String envName, EnviromentConfig config);

    public void release(String envName);

}

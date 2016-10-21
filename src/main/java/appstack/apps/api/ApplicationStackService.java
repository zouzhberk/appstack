package appstack.apps.api;

import appstack.apps.api.view.ApplicationStackView;
import appstack.apps.api.view.StackConfigView;

/**
 * Created by berk (zouzhberk@163.com)) on 10/21/16.
 */
public interface ApplicationStackService
{
    public ApplicationStackView deploy(String stackName, String templateVersionId, StackConfigView config);
}

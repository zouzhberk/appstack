package appstack.apps.api;

import appstack.apps.api.view.ApplicationTemplateView;
import appstack.apps.api.view.CatalogView;
import appstack.apps.api.view.TemplateVersionView;

/**
 * Created by berk (zouzhberk@163.com)) on 10/21/16.
 */
public interface CatalogService
{
    /**
     * List application templates.
     * @return
     */
    public ApplicationTemplateView[] listTemplates();

    public TemplateVersionView[] listTemplateVersions();

    public CatalogView[] listCatalogs();

    public TemplateVersionView find(String versionId);

}


/*
 * Copyright (C) 2017 Marc Magon
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package za.co.mmagon.jwebswing.plugins.bootstrap.dialog;

import java.util.logging.Logger;
import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.logger.LogFactory;

/**
 *
 * @author GedMarc
 * @since 19 Feb 2017
 *
 */
@PluginInformation(pluginName = "Bootstrap Dialog",
                   pluginUniqueName = "bootstrap-dialog",
                   pluginDescription = "The Bootstrap Dialog widget for Bootstrap",
                   pluginVersion = "BS3.3.7 / 4a6",
                   pluginDependancyUniqueIDs = "jquery,bootstrap",
                   pluginCategories = "bootstrap,web ui,ui,framework",
                   pluginSubtitle = "Make use of Bootstrap's modal more monkey-friendly.",
                   pluginGitUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog",
                   pluginSourceUrl = "https://github.com/EugenMayer/bootstrap-dialog",
                   pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-BootstrapDialog/wiki",
                   pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/BootstrapDialogPlugin.jar/download",
                   pluginIconUrl = "bower_components/bootstrap3-dialog/bootstrap_dialog_icon.jpg",
                   pluginIconImageUrl = "bower_components/bootstrap3-dialog/bootstrap_dialog_logo.jpg",
                   pluginLastUpdatedDate = "2017/03/04"
)
public class BSDialogPageConfigurator extends PageConfigurator
{

    private static final long serialVersionUID = 1L;
    private static final Logger log = LogFactory.getInstance().getLogger("BootstrapDialog");

    public BSDialogPageConfigurator()
    {
        super();
        setSortOrder(150);
    }

    @Override
    public Page configure(Page page)
    {
        if (!page.isConfigured())
        {
            log.fine("Configuring Bootstrap Dialog");
            if (za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator.isBootstrap4())
            {
                page.getBody().getJavascriptReferences().add(BSDialogReferencePool.Bootstrap4DialogReference.getJavaScriptReference());
                page.getBody().getCssReferences().add(BSDialogReferencePool.Bootstrap4DialogReference.getCssReference());

                page.getBody().getJavascriptReferences().remove(BSDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
                page.getBody().getCssReferences().remove(BSDialogReferencePool.BootstrapDialogReference.getCssReference());
            }
            else
            {
                page.getBody().getJavascriptReferences().add(BSDialogReferencePool.BootstrapDialogReference.getJavaScriptReference());
                page.getBody().getCssReferences().add(BSDialogReferencePool.BootstrapDialogReference.getCssReference());
            }
            log.fine("Finished with Bootstrap Dialog");
        }

        return page;
    }
}

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

import za.co.mmagon.jwebswing.base.references.CSSReference;
import za.co.mmagon.jwebswing.base.references.JavascriptReference;
import za.co.mmagon.jwebswing.base.servlets.enumarations.RequirementsPriority;
import za.co.mmagon.jwebswing.base.servlets.interfaces.ReferencePool;

/**
 * Default reference pool structure
 *
 * @author GedMarc
 * @since 20 Apr 2016
 */
public enum BSDialogReferencePool implements ReferencePool
{
    BootstrapDialogReference(new JavascriptReference("BootstrapDialog", 1.351, "bower_components/bootstrap3-dialog/dist/js/bootstrap-dialog.min.js", 15),
                             new CSSReference("BootstrapDialogCSS", 1.351, "bower_components/bootstrap3-dialog/dist/css/bootstrap-dialog.min.css")),
    Bootstrap4DialogReference(new JavascriptReference("Bootstrap4Dialog", 1.351, "bower_components/bootstrap4-dialog/dist/js/bootstrap-dialog.min.js", 15),
                              new CSSReference("Bootstrap4DialogCSS", 1.351, "bower_components/bootstrap4-dialog/dist/css/bootstrap-dialog.min.css"));

    private BSDialogReferencePool()
    {
    }

    private JavascriptReference javaScriptReference;
    private CSSReference cssReference;

    private BSDialogReferencePool(JavascriptReference javaScriptReference, CSSReference cssReference)
    {
        this.javaScriptReference = javaScriptReference;
        this.javaScriptReference.setPriority(RequirementsPriority.Fourth);
        this.cssReference = cssReference;
        this.cssReference.setPriority(RequirementsPriority.Fourth);
    }

    @Override
    public JavascriptReference getJavaScriptReference()
    {
        return javaScriptReference;
    }

    @Override
    public void setJavaScriptReference(JavascriptReference javaScriptReference)
    {
        this.javaScriptReference = javaScriptReference;
    }

    @Override
    public CSSReference getCssReference()
    {
        return cssReference;
    }

    @Override
    public void setCssReference(CSSReference cssReference)
    {
        this.cssReference = cssReference;
    }
}

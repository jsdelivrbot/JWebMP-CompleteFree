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
package za.co.mmagon.jwebswing.components.references.jqxwidgets;

import za.co.mmagon.jwebswing.base.references.JavascriptReference;

/**
 * The JQuery JavaScript Reference
 * <p>
 * @since 2014/12/09
 * @version 1.0
 * @author MMagon
 *
 * I have moved these from the features to make it easier to specify remote or local references.
 * <p>
 */
public class JQXCoreJavaScriptReference extends JavascriptReference
{

    public JQXCoreJavaScriptReference()
    {
        super("JQXCore", 3.91, "bower_components/jqwidgets/jqwidgets/jqxcore.js", "https://jqwidgets.com/public/jqwidgets/jqxcore.js");
        setSortOrder(10);
    }

}

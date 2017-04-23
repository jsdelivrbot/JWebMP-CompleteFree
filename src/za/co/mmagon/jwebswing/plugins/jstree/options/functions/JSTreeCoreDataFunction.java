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
package za.co.mmagon.jwebswing.plugins.jstree.options.functions;

import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavascriptLiteralFunction;

/**
 *
 * @author GedMarc
 * @since 22 Dec 2016
 * @version 1.0
 *
 */
public class JSTreeCoreDataFunction extends JavascriptLiteralFunction
{

    private static final long serialVersionUID = 1L;

    public JSTreeCoreDataFunction()
    {
        getFunctionArugments().add("node");
        getFunctionArugments().add("donefunction");
    }

    @Override
    public StringBuilder getLiteralFunction()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("return node;");
        return sb;
    }
}

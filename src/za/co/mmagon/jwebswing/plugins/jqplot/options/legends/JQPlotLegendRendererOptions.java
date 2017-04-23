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
package za.co.mmagon.jwebswing.plugins.jqplot.options.legends;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import za.co.mmagon.jwebswing.plugins.jqplot.JQPlotGraph;
import za.co.mmagon.jwebswing.plugins.jqplot.parts.interfaces.JQPlotLegendRenderer;
import za.co.mmagon.jwebswing.htmlbuilder.javascript.JavaScriptPart;

/**
 * Default renderer options, nothing really here
 *
 * @author GedMarc
 * @since 1 Mar 2016
 */
public class JQPlotLegendRendererOptions extends JavaScriptPart implements JQPlotLegendRenderer
{

    @JsonIgnore
    private JQPlotGraph linkedGraph;

    /**
     * The Default Axis Label Renderer Options
     *
     * @param linkedGraph
     */
    public JQPlotLegendRendererOptions(JQPlotGraph linkedGraph)
    {
        this.linkedGraph = linkedGraph;
    }

    @JsonProperty("renderer")
    @JsonRawValue
    @JsonIgnore
    @Override
    public String getRenderer()
    {
        return "$.jqplot.DateAxisRenderer";
    }

    /**
     * Gets the linked graph
     *
     * @return
     */
    public JQPlotGraph getLinkedGraph()
    {
        return linkedGraph;
    }

    /**
     * Sets the linked graph
     *
     * @param linkedGraph
     */
    public void setLinkedGraph(JQPlotGraph linkedGraph)
    {
        this.linkedGraph = linkedGraph;
    }

}

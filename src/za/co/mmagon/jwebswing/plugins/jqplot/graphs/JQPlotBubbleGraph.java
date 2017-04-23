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
package za.co.mmagon.jwebswing.plugins.jqplot.graphs;

import java.util.ArrayList;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;
import za.co.mmagon.jwebswing.plugins.jqplot.JQPlotGraph;
import za.co.mmagon.jwebswing.plugins.jqplot.graphs.display.JQPlotBubble;
import za.co.mmagon.jwebswing.plugins.jqplot.options.JQPlotOptions;
import za.co.mmagon.jwebswing.plugins.jqplot.options.series.JQPlotSeriesBubbleOptions;

/**
 * The Bubble Graph Renderering for the JQ Plot Library
 * <p>
 * @author mmagon
 * @param <J>
 *
 * @since 2014/07/10
 * <p>
 */
@ComponentInformation(name = "Bubble Graph",
        description = "A bubble graph",
        url = "http://www.jqplot.com/examples/bubbleChart.php")
public class JQPlotBubbleGraph<J extends JQPlotBubbleGraph> extends JQPlotGraph<JQPlotOptions, J>
{

    private static final long serialVersionUID = 1L;

    private ArrayList<JQPlotBubble> bubbles;
    private JQPlotSeriesBubbleOptions bubbleOptions;

    /**
     * Creates a new bubble graph
     */
    public JQPlotBubbleGraph()
    {
        getOptions().getSeriesDefaults();
        getOptions().getSeriesDefaults().setRendererOptions(getBubbleOptions());
    }

    /**
     * Returns the bubble options instance
     *
     * @return
     */
    public final JQPlotSeriesBubbleOptions getBubbleOptions()
    {
        if (bubbleOptions == null)
        {
            bubbleOptions = new JQPlotSeriesBubbleOptions(this);
        }
        return bubbleOptions;
    }

    /**
     * Sets the bubble options
     *
     * @param bubbleOptions
     */
    public void setBubbleOptions(JQPlotSeriesBubbleOptions bubbleOptions)
    {
        this.bubbleOptions = bubbleOptions;
    }

    /**
     * Returns a list of all the bubbles
     *
     * @return
     */
    public ArrayList<JQPlotBubble> getBubbles()
    {
        if (bubbles == null)
        {
            bubbles = new ArrayList<>();
        }
        return bubbles;
    }

    /**
     * Sets the bubbles
     *
     * @param bubbles
     */
    public void setBubbles(ArrayList<JQPlotBubble> bubbles)
    {
        this.bubbles = bubbles;
    }

    /**
     * Adds a bubble into the collection with a specified label Labels can be components as well, this will set the HTML escape off
     * <p>
     * @param x The X Location
     * @param y The Y Location
     * @param radius The Radius of the Bubble
     * @param label The Label of the Bubble
     *
     * @return
     */
    public JQPlotBubble addBubble(double x, double y, int radius, String label)
    {
        JQPlotBubble bubble = new JQPlotBubble(x, y, radius, label);
        getBubbles().add(bubble);
        return bubble;
    }

    /**
     * Renders the data points for the bubbles
     * <p>
     * @return
     */
    @Override
    public StringBuilder getDataPointRender()
    {
        StringBuilder sb = new StringBuilder("[[");

        for (JQPlotBubble next : getBubbles())
        {
            sb.append(next).append(",");
        }

        if (sb.indexOf(",") > 0)
        {
            sb = sb.deleteCharAt(sb.lastIndexOf(","));
        }

        sb.append("]]");
        return sb;
    }
}

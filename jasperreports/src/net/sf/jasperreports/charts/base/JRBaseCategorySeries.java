/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2005 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 185, Berry Street, Suite 6200
 * San Francisco CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.charts.base;

import java.io.Serializable;

import net.sf.jasperreports.charts.JRCategorySeries;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.base.JRBaseObjectFactory;


/**
 * @author Teodor Danciu (teodord@users.sourceforge.net)
 * @version $Id$
 */
public class JRBaseCategorySeries implements JRCategorySeries, Serializable
{


	/**
	 *
	 */
	private static final long serialVersionUID = 10000;

	protected JRExpression seriesExpression = null;
	protected JRExpression categoryExpression = null;
	protected JRExpression valueExpression = null;
	protected JRExpression labelExpression = null;

	
	/**
	 *
	 */
	protected JRBaseCategorySeries()
	{
	}
	
	
	/**
	 *
	 */
	public JRBaseCategorySeries(JRCategorySeries categorySeries, JRBaseObjectFactory factory)
	{
		factory.put(categorySeries, this);

		seriesExpression = factory.getExpression(categorySeries.getSeriesExpression());
		categoryExpression = factory.getExpression(categorySeries.getCategoryExpression());
		valueExpression = factory.getExpression(categorySeries.getValueExpression());
		labelExpression = factory.getExpression(categorySeries.getLabelExpression());
	}

	
	/**
	 *
	 */
	public JRExpression getSeriesExpression()
	{
		return seriesExpression;
	}
		
	/**
	 *
	 */
	public JRExpression getCategoryExpression()
	{
		return categoryExpression;
	}
		
	/**
	 *
	 */
	public JRExpression getValueExpression()
	{
		return valueExpression;
	}
		
	/**
	 *
	 */
	public JRExpression getLabelExpression()
	{
		return labelExpression;
	}
		
}

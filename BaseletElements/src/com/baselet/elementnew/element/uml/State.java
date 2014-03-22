package com.baselet.elementnew.element.uml;

import java.util.Arrays;
import java.util.List;

import com.baselet.diagram.draw.DrawHandler;
import com.baselet.elementnew.ElementId;
import com.baselet.elementnew.NewGridElement;
import com.baselet.elementnew.PropertiesConfig;
import com.baselet.elementnew.facet.Facet;
import com.baselet.elementnew.facet.common.SeparatorLineFacet;
import com.baselet.elementnew.facet.specific.StateTypeFacet;
import com.baselet.elementnew.facet.specific.SubStateSymbolFacet;
import com.baselet.elementnew.settings.Settings;
import com.baselet.elementnew.settings.SettingsManualresizeCenter;

public class State extends NewGridElement {

	@Override
	public ElementId getId() {
		return ElementId.UMLState;
	}

	@Override
	protected void drawCommonContent(DrawHandler drawer, PropertiesConfig propCfg) {
		// if not type is given, draw an action type as default
		if (!propCfg.getFacetResponse(StateTypeFacet.class, false)) {
			StateTypeFacet.drawDefaultState(drawer, getRealSize());
		}
	}

	@Override
	protected Settings createSettings() {
		return new SettingsManualresizeCenter() {
			@Override
			public List<? extends Facet> createFacets() {
				return Arrays.asList(SeparatorLineFacet.INSTANCE_WITH_HALIGN_CHANGE, StateTypeFacet.INSTANCE, SubStateSymbolFacet.INSTANCE);
			}
		};
	}
}
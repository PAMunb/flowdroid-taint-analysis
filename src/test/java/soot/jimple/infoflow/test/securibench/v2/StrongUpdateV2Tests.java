/*******************************************************************************
 * Copyright (c) 2012 Secure Software Engineering Group at EC SPRIDE.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors: Christian Fritz, Steven Arzt, Siegfried Rasthofer, Eric
 * Bodden, and others.
 ******************************************************************************/
package soot.jimple.infoflow.test.securibench.v2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import soot.jimple.infoflow.IInfoflow;

public class StrongUpdateV2Tests extends JUnitTests {

	@Test
	public void strongupdates1() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.strong_updates.StrongUpdates1: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		negativeCheckInfoflow(infoflow);
	}

	@Test
	public void strongupdates2() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.strong_updates.StrongUpdates2: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		negativeCheckInfoflow(infoflow);
	}

	@Test
	public void strongupdates3() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.strong_updates.StrongUpdates3: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		negativeCheckInfoflow(infoflow);
	}

	@Test
	public void strongupdates4() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.strong_updates.StrongUpdates4: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void strongupdates5() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.strong_updates.StrongUpdates5: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		negativeCheckInfoflow(infoflow);
	}

}

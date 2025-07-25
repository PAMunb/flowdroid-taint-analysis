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
package soot.jimple.infoflow.test.securibench.deprecated.v2;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import soot.jimple.infoflow.IInfoflow;

public class InterV2Tests extends JUnitTests {
	@Test
	public void inter1() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter1: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter2() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter2: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 2);
	}

	@Test
	public void inter3() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter3: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter4() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter4: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter5() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter5: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter6() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter6: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter7() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter7: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter8() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter8: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter9() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter9: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 2);
	}

	@Test
	public void inter10() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter10: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter11() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter11: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter12() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter12: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter13() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter13: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void inter14() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.inter.Inter14: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

}

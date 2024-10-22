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

public class CollectionTests extends JUnitTests {

	@Test
	public void collections1() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections1: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections2() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections2: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections3() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections3: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 2);
	}

	@Test
	public void collections4() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections4: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections5() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections5: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections6() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections6: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections7() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections7: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections8() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections8: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections9() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections9: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		negativeCheckInfoflow(infoflow);
		// this test fails because we taint whole list instead of single items..
	}

	@Test
	public void collections10() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections10: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections11() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections11: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections12() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections12: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections13() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections13: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

	@Test
	public void collections14() {
		List<String> epoints = new ArrayList<String>();
		epoints.add(
				"<securibench.v2.micro.collections.Collections14: void doGet(jakarta.servlet.http.HttpServletRequest,jakarta.servlet.http.HttpServletResponse)>");
		IInfoflow infoflow = initInfoflow(epoints);
		infoflow.computeInfoflow(appPath, libPath, entryPointCreator, sources, sinks);
		checkInfoflow(infoflow, 1);
	}

}

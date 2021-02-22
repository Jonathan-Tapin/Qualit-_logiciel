package com.tactfactory.tp1junit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.jupiter.api.Test;

import com.tactfactory.tp1junit.manager.Jeu;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ApplicationTest {

	@Test
	public void test() throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Jeu jeu = new Jeu(4,24,18);
		Method method = Jeu.class.getDeclaredMethod("afficherTour");
		method.setAccessible(true);
		method.invoke(jeu);
	}

	@Test
	public void test1() {
		assertTrue(true);
	}
}

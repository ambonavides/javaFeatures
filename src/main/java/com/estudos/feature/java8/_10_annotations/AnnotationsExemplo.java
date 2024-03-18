package com.estudos.feature.java8._10_annotations;

/**
 * Lugares onde podemos aplicar annotations
 * a partir do java 8
 */

//extends clause
class MyClass /* extends @MyAnnotation OtherClass */ {}

//implements clause
class MyClass2 /* implements @MyAnnotation someInterface */ {}

//generics
class MyClass3/*<MyAnnotation>*/ {}

public class AnnotationsExemplo {
	public static void main(String[] args) {
		
		//ainda em generics
		
		/*List<<MyAnnotation> String> myList;
		* List<<MyAnnotation> T> myList2;
		* List<<MyAnnotation> String> myList3;
		* List<<MyAnnotation> String> myList4;
		* List<<MyAnnotation> String> myList5;
		* List<<MyAnnotation> String> myList6;
		*/
		
	}
}

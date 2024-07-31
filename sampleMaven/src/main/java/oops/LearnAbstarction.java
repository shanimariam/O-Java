package oops;
/*
 * only essential parts hiding the implementation details
 * .apk file --you do not get the function or method from playdtore downloading.
 * Abstarct method-only the declaration but no definition--use abstarct keyword
 * Abstarct class- any class consist of atleast one abstrct method then its a abstarct class.
 * Abstarct class can contain - normal method and abstarct method.
 * In abstarct class use abstarct keyword
 *  we cannot create obje in abstarct class
 *  use the inheritance concept here to implemet the abstarct methods.
 *  write in derived class
 *  concrete class-class contains the complete definition for all methods.
 *  In concrete class, obj can be created
 *  There is no abstarct methods in concrete class
 *  
 */



/* class a is base class
/* abstarct class A------------<Abstract class  // cannot create obj for abstarct class
 * {
 *   abstact void display(); ------>Abstarct method
 * }	
 */

 /* abstract class B extends A----------->Concrete class write implementation 
  * 								     can create obj. 
  * 						              when an abstract mehod -show() added this become abstarct class.
  * 									  cannnot create obj for b now. change to C
 * {
 *  void dispaly()   //normal method
 * {
 * System.out.println("hi shani");
 * abstarct void show(); //abstarct method
 * }
 */

 /* class c extend B -------->now c  is concrete class as there is no abstract methods
 * {
 * void show()
 * {
 * s.o.p("Now I am concrete class");
 * }
 */

 /* class Abstarction ------------>create obj in main method
 * {
 * public static void main(String[] args) 
 * {
 * c obj=new c(); //  class c is derived class of class B object of c can access methods of B and C
 * obj.dispaly()
 * obj.show();
 * }
 *}
 *}
 */

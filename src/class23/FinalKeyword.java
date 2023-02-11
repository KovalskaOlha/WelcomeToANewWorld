package class23;

public final  class FinalKeyword {

    final double gravity=9.8;
    final double PI=3.14;
    final double LightSpeed=299792458;

    final void tryChangingGravity(){
   // gravity=1.6; error because this variable is marked as final and no one can change it
}

}
   /*class Child extends FinalKeyword{
   // final void tryChangingGravity(){  // error because method is final
}  */

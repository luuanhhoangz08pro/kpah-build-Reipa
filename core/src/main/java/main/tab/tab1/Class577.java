package main.tab.tab1;
final class Class577 implements Class258 {
   final Class467 Field1;

   Class577(Class467 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field14 = false;
      if (!Class467.Field11(this.Field1)) {
         Class537 var1 = (Class537)Class105.Field19.Field21.elementAt(this.Field1.Field4);
         short var2 = 0;
         int var3 = -1;
         if (this.Field1.Field13.size() > 0) {
            int var4 = this.Field1.Field13.size();

            for(int var5 = 0; var5 < var4; ++var5) {
               if (((Class537)this.Field1.Field13.elementAt(var5)).Field12 == var1.Field12) {
                  var2 = var1.Field10;
                  var3 = var5;
                  break;
               }
            }
         }

         if (var3 == -1) {
            var3 = this.Field1.Field13.size();
            this.Field1.Field13.addElement(var1);
         }

         if (var2 + Class105.Field19.Field15.Field121[var1.Field12] >= 999) {
            Class467.Field1(this.Field1, "MAX: 999", this.Field1.Field4 % this.Field1.Field5 * 18, this.Field1.Field4 / this.Field1.Field5 * 18);
         } else {
            short var7;
            if ((long)(var7 = Class804.Field48[var1.Field12].Field1) > Class105.Field19.Field15.Field122) {
               Class467.Field1(this.Field1, "Hết tiền", this.Field1.Field4 % this.Field1.Field5 * 18, this.Field1.Field4 / this.Field1.Field5 * 18);
            } else {
               Class105.Field25.Field1("Số lượng: ", new Class575(this, var3, var7), 1, 10, true);
               Class105.Field23 = Class105.Field25;
            }
         }
      }
   }
}

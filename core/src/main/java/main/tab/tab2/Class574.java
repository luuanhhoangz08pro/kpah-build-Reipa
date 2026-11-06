package main.tab.tab2;
final class Class574 implements Class256 {
   final Class464 Field1;

   Class574(Class464 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field14 = false;
      if (!Class464.Field11(this.Field1)) {
         Class534 var1 = (Class534)Class106.Field19.Field21.elementAt(this.Field1.Field4);
         short var2 = 0;
         int var3 = -1;
         if (this.Field1.Field13.size() > 0) {
            int var4 = this.Field1.Field13.size();

            for(int var5 = 0; var5 < var4; ++var5) {
               if (((Class534)this.Field1.Field13.elementAt(var5)).Field12 == var1.Field12) {
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

         if (var2 + Class106.Field19.Field15.Field121[var1.Field12] >= 999) {
            Class464.Field1(this.Field1, "MAX: 999", this.Field1.Field4 % this.Field1.Field5 * 18, this.Field1.Field4 / this.Field1.Field5 * 18);
         } else {
            short var7;
            if ((long)(var7 = Class811.Field48[var1.Field12].Field1) > Class106.Field19.Field15.Field122) {
               Class464.Field1(this.Field1, "Hết tiền", this.Field1.Field4 % this.Field1.Field5 * 18, this.Field1.Field4 / this.Field1.Field5 * 18);
            } else {
               Class106.Field25.Field1("Số lượng: ", new Class572(this, var3, var7), 1, 10, true);
               Class106.Field23 = Class106.Field25;
            }
         }
      }
   }
}

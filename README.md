# CleanCodeOOPPrinciples

CleanCodeOOPPrinciples yazılım ürününde OOP prensipleri çiğnenmiştir ve uygulamanın birçok yerinde kötü kokular (bad smells bkz: Clean Code, Robert C. Martin) bulunmaktadır. Bunları tespit edip düzeltmenizi bekliyoruz.

Ek olarak mimari yapıda da sorunlar bulunmaktadır. Mesela sistemde yeni bir Weapon tipi tanımlanırsa yaşanacak sorunlar nelerdir?
+ CraftsmanHuman.java ve WarriorHuman.java classlarında yeni weapon tipiyle ilgili değişiklik if conditionlara eklenmeli 
Ayrıca sisteme yeni bir Human tipi gelirse nerelerde değişiklik yapmak gerekecek bu durum Open-Closed prensibinde ne gibi sorunlara yol açar? 
+ Gereksiz boş metod implementleri olacak yeni Human sınıfında

Uygulamada genel olarak SOLID prensibini bozduğunu düşündüğünüz sınıfları istediğiniz gibi değiştirebilirsiniz. Yaptığınız değişikliklerin sebeplerini yorum satırı olarak yazmanızı bekliyoruz. En fazla iki sınıf için geleneğe uygun Javadoc yazmanızı istiyoruz. Uygulamayı herhangi bir Java IDE'sinde "ClearOOPAndPrinciples" sınıfını Run ederek çalıştırabilirsiniz.

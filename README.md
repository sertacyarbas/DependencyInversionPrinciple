# Dependency Inversion Principle (DIP) Uygulama Örneği

Bu proje, S.O.L.I.D prensiplerinden sonuncusu olan Dependency Inversion Principle (DIP)'yi göstermek için hazırlanmıştır. Proje, DIP'yi ihlal eden bir yapıyı ve bu ilkeye uygun olarak yeniden yapılandırılmış bir yapıyı içermektedir.

## Proje Yapısı

Proje, iki ana klasör altında organize edilmiştir:

- **bad**: DIP'nin ihlal edildiği bir yapıyı temsil eder.
- **good**: DIP prensibine uygun olarak yeniden yapılandırılmış yapıyı temsil eder.

### Klasör ve Dosya Yapısı
![image](https://github.com/user-attachments/assets/14a36d29-5189-4766-818e-f7f613e650f0)

### Klasörlerin Açıklamaları

- **bad**: Bu klasörde, yüksek seviyeli sınıf olan `WeatherApp`, düşük seviyeli sınıflara bağlıdır. İlk ihtiyaç gereği OpenWeatherMapService'e bağlıyken, karar değişikliği nedeniyle AccuWeatherService'e geçiş yapmak, bu sınıfta değişiklik yapma gerekliliği doğurmuştur. Bu yüzden bu yapı, DIP'yi ihlal eden bir örnek teşkil eder.
  
- **good**: Bu klasörde, düşük seviyeli sınıflar OpenWeatherMapService ve AccuWeatherService, WeatherService interface'ini implement eder. Yüksek seviyeli sınıf WeatherService interface'ine bağımlıdır. Yeni bir hava durumu api entegrasyonunda yüksek seviyeli sınıf değişmez. Bu yüzden bu yapı DIP'ye uygundur.

## Nasıl Çalıştırılır

### DIP İhlali Örneği (bad)

DIP'nin ihlal edildiği yapıyı çalıştırmak için `bad/Application.java` dosyasını çalıştırın.

### DIP'ye Uygun Örnek (good)

DIP prensibine uygun yapıyı görmek için `good/Application.java` dosyasını çalıştırın.

## Neden DIP?

**Dependency Inversion Principle**, nesne yönelimli programlamanın SOLID prensiplerinden biridir. Bu prensip, üst seviye modüllerin alt seviye modüllere doğrudan bağımlı olmaması gerektiğini savunur. Bunun yerine, her iki modül de soyutlamalara (arayüz veya soyut sınıflara) bağımlı olmalıdır. Bu sayede, sistemin bağımlılık yapısı tersine çevrilir ve yüksek seviyeli bileşenler alt seviyeli detaylara bağlı kalmaz. DIP'ye uygun yapılar, esnekliği artırır ve modüllerin birbirinden bağımsız geliştirilip değiştirilebilmesini sağlar. Böylelikle, yazılım sistemleri daha sürdürülebilir ve genişletilebilir hale gelir, değişiklik yapma maliyeti düşer ve yeni özellikler eklemek daha kolay olur.

# SE_Lab2

## آشنایی با اصول شئ‌گرایی (موسوم به اصول SOLID)


### گام ۱: افزودن یک روش پیام رسانی دیگر

تغییراتی را که در کد فعلی برنامه می‌دهید، در جدول زیر ثبت کنید و در نهایت تعداد کل تغییرات را اعلان کنید.
    - توجه: مواردی که به عنوان تغییرات باید اعلان شود شامل این موارد هستند:
      1. ساخت کلاس جدید
      2. افزودن تابع جدید به کلاس و یا واسط (برای توابع جدید صرفا اعلام تغییر کنید)
      3. هر خطوط پیاپی‌ای که در تابع main و برای افزودن یک قابلیت جدید اضافه می‌کنید. به عنوان مثال اگر سه خط را به منظور تشخیص نوع پیام اضافه می‌کنید، آن سه خط را در قالب یک تغییر اعلام کنید (البته جزییات آن را در ستون «شرحی کوتاه از تغییر» توضیح دهید).

<table dir='rtl'>
<tbody>
<tr>
<td width="64">
<p><strong>ردیف</strong></p>
</td>
<td width="198">
<p><strong>محل اعمال تغییرات (کلاس/واسط)</strong></p>
</td>
<td width="141">
<p><strong>عنوان تغییر</strong></p>
</td>
<td width="292">
<p><strong>شرحی کوتاه از تغییر</strong></p>
</td>
</tr>
	
<tr>
<td width="64">
<p><strong>۱</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن کلاس PhoneOrderService به پکیج PaymentServices</p>
</td>
<td width="292">
<p>افزودن کلاس PhoneOrderService که واسط OrderService را پیاده‌سازی کرده است</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۲</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister با ورودی نام مشتری</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۳</strong></p>
</td>
<td width="198">
<p>OrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment با ورودی قیمت غذا</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۴</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش حضوری</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان onSiteOrderRegister با ورودی نام مشتری و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۵</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش آنلاین</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان onlineOrderRegister با ورودی نام مشتری و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۶</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister با ورودی نام مشتری که متنی را چاپ می‌کند</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۷</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش حضوری</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان onSiteOrderPayment با ورودی قیمت غذا و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۸</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش آنلاین</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان onlineOrderPayment با ورودی قیمت غذا و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۹</strong></p>
</td>
<td width="198">
<p>PhoneOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment با ورودی قیمت غذا که متنی را چاپ می‌کند</p>
</td>
</tr>


<tr>
<td width="64">
<p><strong>۱۰</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister با ورودی نام مشتری و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۱</strong></p>
</td>
<td width="198">
<p>OnSiteOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment با ورودی قیمت غذا و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۲</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع ثبت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderRegister با ورودی نام مشتری و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۳</strong></p>
</td>
<td width="198">
<p>OnlineOrderService</p>
</td>
<td width="141">
<p>افزودن تابع پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>افزودن یک تابع void با عنوان phoneOrderPayment با ورودی قیمت غذا و بدنه‌ی خالی</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۴</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن گزینه‌ی روش پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن گزینه‌ی 3 for phone به ورودی println خط ۳۹ برای اینکه بتوان روش پرداخت تلفنی را انتخاب کرد</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۵</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن شرط انتخاب روش پرداخت تلفنی</p>
</td>
<td width="292">
<p>افزودن شرط customerAnswerForPaymentMethod == 3 به خط ۴۷. در صورتی که مشتری گزینه‌ی ۳ را انتخاب کند بلاک مربوط به این شرط اجرا می‌شود و orderService آبجکتی از کلاس PhoneOrderService را ذخیره می‌کند و تابع ثبت سفارش تلفنی را با نام مشتری صدا می‌زند.</p>
</td>
</tr>

<tr>
<td width="64">
<p><strong>۱۶</strong></p>
</td>
<td width="198">
<p>Main</p>
</td>
<td width="141">
<p>افزودن شرط پرداخت سفارش تلفنی</p>
</td>
<td width="292">
<p>در خط ۵۸ این شرط اضافه شده که اگر orderService از جنس PhoneOrderService بود یعنی مشتری روش پرداخت تلفنی را انتخاب کرده، پرداخت تلفنی با ورودی قیمت غذا انجام شود.</p>
</td>
</tr>

</tbody>
</table>

مجموع تعداد تغییرات: ۱۶

### گام ۲: تحلیل و وارسی برنامه از منظر تحقق و یا عدم تحقق اصول SOLID
در خصوص این برنامه‌ای که نوشته شده بود و شما یک قابلیت به آن اضافه کردید، بر اساس اصول SOLID موارد نقض و یا محقق شدن هر کدام از آن اصول را بیان کنید. در بیان موارد تحقق و نقض، علت تحقق و یا نقض را نیز به صورت کامل توضیح دهید:

<table dir='rtl'>
<tbody>
<tr>
<td rowspan="2" width="240">
<p>اصل 1</p>
<p>Single Responsibility</p>
</td>
<td width="95">
<p><strong>موارد تحقق</strong></p>
</td>
<td width="454">
<p>
	کلاس Food: فقط مسئولیت هندل کردن ویژگی‌های مربوط به غذا مانند اسم و قیمت آن به این کلاس واگذار شده و فقط به دلیل تغییر در ویژگی‌های غذا این کلاس تغییر می‌کند.
</p>
<p>
	کلاس Order: فقط مسئولیت هندل کردن سفارش‌ها (لیست غذاهای سفارش داده‌شده و مبلغ کل سفارش) را به عهده دارد و در صورت تغییر در ساختار سفارش و نحوه‌ی محاسبه‌ی مبلغ کل این کلاس تغییر می‌کند.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
	کلاس OnlineOrderService: در این کلاس هر دو مسئولیت سفارش و پرداخت آنلاین هندل شده که بیزینس‌شان کاملا از هم جداست و همین باعث می‌شود که تغییرات این کلاس به خاطر چند دلیل رخ دهد.
</p>
<p>
	کلاس OnSiteOrderService: در این کلاس هر دو مسئولیت سفارش و پرداخت حضوری هندل شده که بیزینس‌شان کاملا از هم جداست و همین باعث می‌شود که تغییرات این کلاس به خاطر چند دلیل رخ دهد.
</p>
<p>
	کلاس PhoneOrderService: در این کلاس هر دو مسئولیت سفارش و پرداخت تلفنی هندل شده که بیزینس‌شان کاملا از هم جداست و همین باعث می‌شود که تغییرات این کلاس به خاطر چند دلیل رخ دهد.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 2</p>
<p>Open-Close Principle (OCP)</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>روش‌های جدید سفارش می‌توانند بدون نیاز به تغییر کد موجود با ایجاد کلاس‌های جدید که OrderService را پیاده‌سازی می‌کنند اضافه شوند.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>در Main.java، اضافه کردن روش‌های جدید نیاز به تغییرات در کد موجود دارد.</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 3</p>
<p>Liskov Substitution Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
به دلیل وجود
interface
با نام
OrderService
این اصل تا حدودی رعایت شده است اما این
interface
به درستی پیاده سازی نشده است.
<br>
تعریف این interface می‌تواند در روند اصلی برنامه به استفاده از 
polymorphism
 در نحوه پرداخت و ثبت سفارش کمک کند.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
علیرغم داشتن
OrderService 
به دلیل رعایت نکردن رابطه
is a 
ناچارا از 
if و else
در کلاس main استفاده شده است.
<br>
به طور خاص هنگام صدا زدن تابع register
برای ثبت سفارش و هنگام صدا زدن تابع payment
برای پرداخت مجبور به استفاده از if
های متوالی هستیم.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 4</p>
<p>Interface Segregation Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>
این اصل تقریبا رعایت نشده است اما به طور کلی هر کدام از فرزندان OrderService
تعدادی از توابع والدشان را override
کرده اند.
</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>
در OrderService
برای ثبت سفارش و پرداخت هر کدام از فرزندان، توابع جدایی نوشته شده است که در دیگر فرزندان به صورت توابعی با بدنه خالی override میشوند.
<br>
این مسئله باعث عدم امکان استفاده از polymorphism 
به نحو صحیح می‌باشد.
</p>
</td>
</tr>
<tr>
<td rowspan="2">
<p>اصل 5</p>
<p>Dependency Inversion Principle</p>
</td>
<td>
<p><strong>موارد تحقق</strong></p>
</td>
<td>
<p>ماژول سطح بالا (Main.java) به انتزاع‌ها (OrderService) وابسته است و نه به پیاده‌سازی‌های خاص.</p>
</td>
</tr>
<tr>
<td>
<p><strong>موارد نقض</strong></p>
</td>
<td>
<p>Main.java هنوز نیاز به نمونه‌سازی از کلاس‌های خاص OrderService دارد که می‌توان آن را با استفاده از dependency injection بهبود داد.</p>
</td>
</tr>
</tbody>
</table>

در خصوص هرکدام از موارد نقض هرکدام از اصول، یک راهکار را به منظور رفع آن مشکل ارایه داده و در جدول زیر ثبت نمایید:

<table dir='rtl'>
<tbody>
<tr>
<td width="168">
<p><strong>اصل مربوطه (از اصول </strong><strong>SOLID</strong><strong>)</strong></p>
</td>
<td width="246">
<p><strong>علت نقض</strong></p>
</td>
<td width="284">
<p><strong>راه حل پیشنهادی</strong></p>
</td>
</tr>
<tr>
<td width="168">
<p>Single Responsibility</p>
</td>
<td width="246">
<p>انجام دو مسئولیت متفاوت ثبت سفارش و پرداخت در کلاس‌های OnlineOrderService, OnSiteOrderService, PhoneOrderService</p>
</td>
<td width="284">
<p>
	ساخت کلاس‌های جداگانه برای هر کدام از مسئولیت‌های ثبت سفارش آنلاین (OnlineOrderRegister)، پرداخت سفارش آنلاین (OnlineOrderPayment)، ثبت سفارش حضوری (OnSiteOrderRegister)، پرداخت سفارش حضوری (OnSiteOrderPayment)، ثبت سفارش تلفنی (PhoneOrderRegister)، پرداخت سفارش تلفنی (PhoneOrderPayment)
</p>
</td>
</tr>
<tr>
<td width="168">
<p>Open-Close Principle</p>
</td>
<td width="246">
<p>برای افزودن روش‌های جدید نیاز است Main تغییر کند.</p>
</td>
<td width="284">
<p>استفاده از OrderServiceFactory برای ایجاد نمونه‌های OrderService بدون تغییر در Main.java.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>Liskov Substitution Principle
<br>
و
<br>
Interface Segregation Principle
</p>
</td>
<td width="246">
<p>
وجود توابعی در interface
که در کلاس فرزند پیاده سازی نشده اند.
<br>
استفاده از ساختار شرطی برای چک کردن نوع کلاس به جای استفاده از polymorphism
در زمان اجرا.
</p>
</td>
<td width="284">
<p>
حذف توابعی که concrete 
هستند و مخصوص هر کلاس پیاده سازی شده اند و تبدیل آنها به توابعی انتزاعی که همه کلاس ها بتوانند از آن ارث بری کنند و بدنه آن را پیاده سازی کنند.
<br>
OrderService باید تنها دارای دو تابع payment و register  باشد.
</p>
</td>
</tr>
<tr>
<td width="168">
<p>Dependency Inversion Principal</p>
</td>
<td width="246">
<p>وابستگی مستقیم کلاس Main به OrderService و استفاده مستقیم از پیاده‌سازی‌های concrete	</p>
</td>
<td width="284">
<p>استفاده از تزریق وابستگی (Dependency Injection) برای تزریق نمونه‌ای از OrderServiceFactory به کلاس Main و استفاده از آن. به جای ایجاد مستقیم نمونه‌ها، آنها را به عنوان وابستگی تزریق می‌کنیم.
</p>
</td>
</tr>
</tbody>
</table>

### گام ۳: اصلاح موارد نقض
در نهایت، بر اساس تحلیلی که انجام داده‌اید و راه حل‌هایی که در بخش قبل ارایه کردید، کد را اصلاح کرده و بر روی مخزن گیت‌هاب و در پوشه‌ای مجزا از گام قبل commit و push کنید. انتظار می‌رود که تمامی راه حل‌های پیشنهادی خود را بر روی این نسخه اعمال کنید و تمامی بهبودهایی که انجام می‌دهید، در جداول بخش قبل موجود باشد.

### گام ۴: بررسی مجدد تغییرات مورد نیاز
فرض کنید که گام 1 را برای کد اصلاح شده (پس از انجام گام‌های ۲ و ۳) اجرا کرده‌اید.
1. در این صورت از انجام کدام یک از تغییرات ثبت شده در جدول گام ۱ معاف خواهید شد؟ تغییرات ۲ - ۳ - ۴ - ۵ - ۷ - ۸ - ۱۰ - ۱۱ - ۱۲ - ۱۳
2. تعداد تغییرات مورد نیاز، چند تغییر خواهد شد؟ ۶
   با اصلاحات انجام‌شده در کد، در صورت اضافه کردن روش ثبت و پرداخت سفارش تلفنی نیاز به تغییرات زیر داریم:
   ۱. ساخت کلاس PhoneOrderPayment که واسط OrderPaymentService را پیاده‌سازی می‌کند
   ۲. ساخت کلاس PhoneOrderRegister که واسط OrderRegisterService را پیاده‌سازی می‌کند
   ۳. اضافه کردن شرط جدید به فکتوری متد در کلاس OrderPaymentFactory
   ۴. اضافه کردن شرط جدید به فکتوری متد در کلاس OrderRegisterFactory
   ۵. تغییر ورودی println در خط ۳۷ تابع main
   ۶. ساخت سرویس‌های ثبت و پرداخت با استفاده از فکتوری متد

### گام ۵: جمع بندی
در این بخش، بیان کنید که از این گام چه نتیجه‌ای گرفته‌اید؟ و به نظر شما به کارگیری صحیح اصول SOLID در گام‌های ۳ و ۴ چه مزایایی را نسبت به حالتی دارد که این اصول رعایت نشده‌بود؟
	تعداد تغییرات مورد نیاز در گام ۴ برای اضافه کردن روش جدید ثبت و پرداخت سفارش حیلی کمتر از گام ۱ است چون در آن اصول SOLID رعایت شده است.
 با رعایت این اصول نگه‌داری و تغییر کد راحت‌تر می‌شود و میزان coupling در کد کمتر می‌شود یعنی وابستگی کلاس‌ها به هم کم است و تغییرات یک کلاس تاثیری روی کلاس‌های دیگر ندارد. از طرفی cohesion کلاس‌ها هم بیشتر می‌شود و هر کلاسی یک مسئولیت مشخصی دارد و فیلدها و متدهایش هم برای انجام آن مسئولیت وجود دارند.

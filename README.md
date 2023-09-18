# Проект по автоматизации Digital Health платформы, объединяющей различные сервисы цифровой медицины.
<a target="_blank" href="https://sberhealth.ru/">Сайт проекта</a>

## :world_map: Содержание
- [Технологии и инструменты](#earth_africa-технологии-и-инструменты)
- [Примеры UI тестов](#pager-Примеры-UI-тестов)
- [Сборка в Jenkins с параметрами](#-Сборка-в-Jenkins-с-параметрами)
- [Allure отчет](#-Allure-отчет)
- [Видео прохождения тестов на Selenoid](#film_projector-Видео-прохождения-тестов-на-Selenoid)

## :earth_africa: Технологии и инструменты
<p>
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA" title="IntelliJ IDEA"/></a>
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java" title="Java"/></a>
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github" title="GitHub"/></a>
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5" title="JUnit5"/></a>
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle" title="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide" title="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid" title="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure" title="Allure"/></a>
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins" title="Jenkins"/></a>
</p>

В данном проекте автотесты написаны на <code>Java</code> с использованием <code>Selenide</code> для UI-тестов
>
> <code>Selenoid</code> выполняет запуск браузеров в контейнерах <code>Docker</code>.
>
> <code>Allure Report</code> формирует отчет о запуске тестов.
>
> Для автоматизированной сборки проекта используется <code>Gradle</code>.
>
> В качестве библиотеки для модульного тестирования используется <code>JUnit 5</code>.
>
> <code>Jenkins</code> выполняет запуск тестов.
>
## :pager: Примеры UI тестов
- Проверка работоспособности ссылок на странице (например ссылка логина в ЛК)
- Проверка выдачи результатов врачей при заданном фильтре
- Проверка добавления анализа в корзину

## <img src="images/Jenkins.svg" width="25" height="25"  alt="Jenkins" title="Jenkins"/></a> Сборка в Jenkins с параметрами
>
> В сборке присутствуют настраиваемые параметры.
>
> Например размер запускаемого браузера. Сами тесты запускаются удаленно с помощью <code>Selenoid</code>
<p align="center">
<img title="Сборка в Jenkins с параметрами" src="images/Jenkins.png">
</p>

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure_Report" title="Allure_Report" title="Allure_Report"/></a> Allure отчет
>
> Allure формирует подробный отчет о прогоне тестов.
>
> Отчеты формируются по категориям, в конце приложен скриншот, видео запись прогона теста и логи.
<p align="center">
<img title="Allure отчет" src="images/Allure.png"> 
</p>

## :film_projector: Видео прохождения тестов на Selenoid
>
> <code>Selenoid</code> пишет видео прогона каждого теста и видео прикладывается в отчет <code>Allure</code>
>
<p>
<img title="Selenoid Video" src="images/Selenoid_video.gif" alt="video"> 
</p>

<h2>
  :crystal_ball: Всю сборку можно запустить самостоятельно https://jenkins.autotests.cloud/job/mipkasnow-QaGuru-Diploma-Project-UI/ (необходимо предварительно  зарегистрироваться)
</h2>

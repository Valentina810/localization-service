# Мобильное приложение для сохраненения заметок

Имеет 6 экранов, для которых существуют 6 файлов локализации:

- ru/login.json

```json
{
  "title": "Вход",
  "email": "Электронная почта",
  "password": "Пароль",
  "login_button": "Войти",
  "no_account": "Нет аккаунта?",
  "register_here": "Зарегистрироваться"
}
```

ru/register.json

```json
{
  "title": "Регистрация",
  "name": "Имя",
  "email": "Электронная почта",
  "password": "Пароль",
  "confirm_password": "Повторите пароль",
  "register_button": "Создать аккаунт",
  "have_account": "Уже есть аккаунт?",
  "login_here": "Войти"
}
```

ru/home.json

```json
{
  "title": "Мои заметки",
  "add_note": "Добавить заметку",
  "search_placeholder": "Поиск по заметкам...",
  "no_notes": "Нет сохранённых заметок"
}
```

ru/edit_note.json

```json
{
  "title": "Редактирование заметки",
  "note_title": "Заголовок",
  "note_body": "Текст заметки",
  "save_button": "Сохранить",
  "delete_button": "Удалить",
  "cancel_button": "Отмена"
}
```

ru/view_note.json

```json
{
  "title": "Просмотр заметки",
  "edit_button": "Редактировать",
  "delete_button": "Удалить",
  "back_button": "Назад"
}
```

ru/settings.json

```json
{
  "title": "Настройки",
  "language": "Язык",
  "dark_mode": "Темная тема",
  "light_mode": "Светлая тема",
  "notifications": {
    "title": "Уведомления",
    "enable": "Включить уведомления",
    "daily_reminder": "Ежедневное напоминание",
    "sound": "Звук уведомлений"
  },
  "logout": "Выйти из аккаунта"
}
```

## Требования к сервису:

:blueberries: Сервис должен иметь метод

```
/api/localization/{locale}/{screen}
```

который принимает на вход одну из локалей - locale и название экрана - screen и возвращает соответсвующий json с
переводом на указанный язык<br>
:blueberries: Данные должны храниться в БД MongoDb<br>
:blueberries: Должна быть возможность изменить данные без рестарта сервиса<br>

## Локали:
| Язык        | Локаль |
|-------------|--------|
| Русский     | ru     |
| Английский  | en     |
| Французский | fr     |
| Итальянский | it     |
| Китайский   | zh     |
| Японский    | ja     |

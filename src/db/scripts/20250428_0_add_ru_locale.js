use('localization-db');
// db.localization.deleteMany({ locale: "ru" });
db.localization.insertOne({
    _id: "ru",
    locale: "ru",
    screens: {
        login: {
            title: "Вход",
            email: "Электронная почта",
            password: "Пароль",
            login_button: "Войти",
            no_account: "Нет аккаунта?",
            register_here: "Зарегистрироваться"
        },
        register: {
            title: "Регистрация",
            name: "Имя",
            email: "Электронная почта",
            password: "Пароль",
            confirm_password: "Повторите пароль",
            register_button: "Создать аккаунт",
            have_account: "Уже есть аккаунт?",
            login_here: "Войти"
        },
        home: {
            title: "Мои заметки",
            add_note: "Добавить заметку",
            search_placeholder: "Поиск по заметкам...",
            no_notes: "Нет сохранённых заметок"
        },
        edit_note: {
            title: "Редактирование заметки",
            note_title: "Заголовок",
            note_body: "Текст заметки",
            save_button: "Сохранить",
            delete_button: "Удалить",
            cancel_button: "Отмена"
        },
        view_note: {
            title: "Просмотр заметки",
            edit_button: "Редактировать",
            delete_button: "Удалить",
            back_button: "Назад"
        },
        settings: {
            title: "Настройки",
            language: "Язык",
            mode: {
                title: "Тема",
                dark: "Темная",
                light: "Светлая"
            },
            notifications: {
                title: "Уведомления",
                enable: "Включить уведомления",
                daily_reminder: "Ежедневное напоминание",
                sound: "Звук уведомлений"
            },
            logout: "Выйти из аккаунта"
        }
    }
});
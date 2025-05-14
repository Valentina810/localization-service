use('localization-db');
// db.localization.deleteMany({ locale: "ja" });
db.localization.insertOne({
    _id: "ja",
    locale: "ja",
    screens: {
        login: {
            title: "ログイン",
            email: "メールアドレス",
            password: "パスワード",
            login_button: "ログイン",
            no_account: "アカウントをお持ちでないですか？",
            register_here: "登録する"
        },
        register: {
            title: "登録",
            name: "名前",
            email: "メールアドレス",
            password: "パスワード",
            confirm_password: "パスワードの確認",
            register_button: "アカウント作成",
            have_account: "すでにアカウントをお持ちですか？",
            login_here: "ログイン"
        },
        home: {
            title: "私のノート",
            add_note: "ノートを追加",
            search_placeholder: "ノートを検索...",
            no_notes: "保存されたノートがありません"
        },
        edit_note: {
            title: "ノートを編集",
            note_title: "タイトル",
            note_body: "ノート本文",
            save_button: "保存",
            delete_button: "削除",
            cancel_button: "キャンセル"
        },
        view_note: {
            title: "ノートを表示",
            edit_button: "編集",
            delete_button: "削除",
            back_button: "戻る"
        },
        settings: {
            title: "設定",
            language: "言語",
            mode: {
                title: "テーマ",
                dark: "ダーク",
                light: "ライト"
            },
            notifications: {
                title: "通知",
                enable: "通知を有効にする",
                daily_reminder: "毎日のリマインダー",
                sound: "通知音"
            },
            logout: "ログアウト"
        }
    }
});
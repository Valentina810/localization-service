#!/bin/bash

DB_NAME="localization-db"
FILES=(
  "20250428_0_add_ru_locale.js"
  "20250428_1_add_en_locale.js"
  "20250428_2_add_fr_locale.js"
  "20250428_3_add_it_locale.js"
  "20250428_4_add_zh_locale.js"
  "20250428_5_add_ja_locale.js"
  "20250504_6_update_structure.js"
)

SCRIPT_DIR="/scripts"

echo "Начинаю запуск скриптов из $SCRIPT_DIR"

cd "$SCRIPT_DIR" || { echo "Не удалось перейти в $SCRIPT_DIR"; exit 1; }

for file in "${FILES[@]}"; do
  if [[ -f "$file" ]]; then
    echo "Выполнение скрипта $file..."
    mongosh "$DB_NAME" "$file"

    if [ $? -ne 0 ]; then
      echo "Ошибка при выполнении $file"
      exit 1
    fi
  else
    echo "Файл $file не найден!"
    exit 1
  fi
done

echo "Все скрипты выполнены!"
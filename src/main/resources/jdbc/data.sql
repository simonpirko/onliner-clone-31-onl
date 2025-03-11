INSERT INTO account VALUES (default,'Polya',crypt('1111', gen_salt('md5')),'+375447937701',
                            'USER','null');
INSERT INTO account VALUES (default,'Prime',crypt('1111', gen_salt('md5')),'+375447937702',
                            'BUSINESS','null');
INSERT INTO account VALUES (default,'Newton',crypt('1111', gen_salt('md5')),'+375447937703',
                            'BUSINESS','null');
INSERT INTO account VALUES (default,'Tehnomir',crypt('1111', gen_salt('md5')),'+375447937704',
                            'BUSINESS','null');
INSERT INTO account VALUES (default,'Mobiline',crypt('1111', gen_salt('md5')),'+375447937705',
                            'BUSINESS','null');



INSERT INTO category VALUES (default, 'Phone');
INSERT INTO category VALUES (default, 'TV');
INSERT INTO category VALUES (default, 'Notebook');


INSERT INTO manufacturer VALUES (default, 'Apple', '....');
INSERT INTO manufacturer VALUES (default, 'Samsung', '....');
INSERT INTO manufacturer VALUES (default, 'Xiaomi', '....');


INSERT INTO product VALUES (default, 'Iphone 15 ProMax 256GB', '1',
                            'смартфон, Apple iOS, экран 6.7" OLED (1290x2796) 120 Гц, Apple A17 Pro, ОЗУ 8 ГБ, память 256 ГБ, камера 48 Мп, аккумулятор 4422 мАч, 1 SIM (nano-SIM/eSIM), моноблок, влагозащита IP68', '2023', '1', 'Основные отличия от предыдущей модели iPhone 14 Pro Max:
- Титановый ободок, который делает смартфоны легче на 20 грамм при тех же габаритах.
- Матовый титановый корпус, который не царапается и не покрывается отпечатками (за исключением темных версий).
- Порт USB-C, обеспечивающий более быструю передачу данных до 10 Гбит/с.
- Скорость зарядки осталась прежней, но можно использовать мощные зарядки от Макбука до 27 Вт.
- Новая камера iPhone 15 Pro Max, с перископным модулем для более крупных и качественных снимков.');
INSERT INTO product VALUES (default, 'Iphone 16 ProMax 256GB', '1',
                            'смартфон, Apple iOS, экран 6.9" OLED (1320x2868) 120 Гц, Apple A18 Pro, ОЗУ 8 ГБ, память 256 ГБ, камера 48 Мп, аккумулятор 4685 мАч, 1 SIM (eSIM/nano-SIM), моноблок, влагозащита IP68', '2024', '1', 'Смартфоны Apple iPhone 16 Pro и iPhone 16 Pro Max оснащены чипом A18 Pro, системой управления камерой и, как утверждает Apple, "значительно улучшенной автономностью". Основная камера тоже обновлена, как и ультраширокая камера, а на версии Pro появился 5-кратный телеобъектив. Корпус из титана остался, и компания обещает самые тонкие рамки за всю историю своих устройств.');
INSERT INTO product VALUES (default, 'Galaxy S25 Ultra 256GB', '1',
                            'смартфон, Android, экран 6.9" AMOLED (1440x3120) 120 Гц, Qualcomm Snapdragon 8 Elite, ОЗУ 12 ГБ, память 256 ГБ, камера 200 Мп, аккумулятор 5000 мАч, 2 SIM (nano-SIM/eSIM), моноблок, влагозащита IP68', '2024', '2', 'Скругленный форм-фактор нового Galaxy S25 Ultra отражает узнаваемую индивидуальность серии Galaxy S. Это ультрасовременная модель со смелым дизайном в элегантной и прочной титановой рамке со встроенным электронным пером S Pen.');
INSERT INTO product VALUES (default, '14 T 256GB', '1',
                            'смартфон, Android, экран 6.67" AMOLED (1220x2712) 144 Гц, Mediatek Dimensity 8300 Ultra, ОЗУ 12 ГБ, память 256 ГБ, камера 50 Мп, аккумулятор 5000 мАч, 2 SIM (nano-SIM/eSIM), моноблок, влагозащита IP68', '2024', '3', ' Xiaomi 14T и 14T Pro, оснащены 12 ГБ оперативной памяти, чего достаточно для повседневных задач, хотя это меньше по сравнению с моделями 14-й серии без индекса "T". Внутри установлены процессоры Mediatek, но в Xiaomi 14T Pro используется топовый чипсет Dimensity 9300+, который конкурирует с флагманскими решениями Snapdragon от Qualcomm.');
INSERT INTO product VALUES (default, 'Pixel 9 128GB', '1',
                            'смартфон, Android, экран 6.24" OLED (1080x2424) 120 Гц, Google Tensor G4, ОЗУ 12 ГБ, память 128 ГБ, камера 50 Мп, аккумулятор 4700 мАч, 1 SIM (nano-SIM/eSIM), моноблок, влагозащита IP68', '2024', '2', 'Мощь искусственного интеллекта
Google Tensor G4 - самый мощный чип в Pixel на сегодняшний день. Он создан для взаимодействия с Gemini непосредственно на самом устройстве.');


INSERT INTO productimages VALUES (default, '5',
                                  'https://imgproxy.onliner.by/aaTF8bOHC90y_DaI_znh1iS2NnbgdSTnpaohZejm-5M/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/Yjk2OTM4Mzg1MTdi/OGYwNGNhZDAwNzgz/MWMxYWRjY2QuanBn');
INSERT INTO productimages VALUES (default, '5',
                                  'https://imgproxy.onliner.by/HDKri97ZzLnjC4VEHYQNX3KuQwKVKGjUlKC7-vs69Hc/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/YjkwOWRhOGNlNzQ0/ZDdlMjE2NjJhNGU2/NzkxNmUzZDkuanBn');
INSERT INTO productimages VALUES (default, '5',
                                  'https://imgproxy.onliner.by/kl5kxH8I2fAjAcIHeKg845RENMdMn80xdtZvmtC-s9I/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/NTIwNjkyZjYyYjcw/NjY2YTE1MzgzZDcy/ZDg0ZDZiYjguanBn');
INSERT INTO productimages VALUES (default, '5',
                                  'https://imgproxy.onliner.by/OPimxg_E7EyV_W6bl4XKf5btcmC6c2BFiJSJMK7bGgA/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MmFhNzU1YzNjOWMx/NmJhMDNlZmZlYWU2/NmIwODJhMjguanBn');
INSERT INTO productimages VALUES (default, '5',
                                  'https://imgproxy.onliner.by/HHr13tJ_w1QkgSfOmehDjMIuLqjZ0oUCRfOyJ8Y26jM/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/ZjkyODk0MThhNjM3/OThkOTU5Mjc1NzI3/MDYzMGI2NTMuanBn');

INSERT INTO productimages VALUES (default, '4',
                                  'https://imgproxy.onliner.by/dFYrdf-d_49gAQ7NmsPJ2zEIL_ANthR7VypzrDeF0PI/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/YmExNjBhZWQ3YjBh/OTlkZjk5MWMzNDk5/ZmU3ODRjZjQuanBn');
INSERT INTO productimages VALUES (default, '4',
                                  'https://imgproxy.onliner.by/cblqn01_f8x0c3uZ95cCCjMF1K4lrX30Mxook6FNi_M/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MWEyZmY1YzU1MmRh/YjZhNDMxYWRlZGYw/ZTdkMjY1NmEuanBn');
INSERT INTO productimages VALUES (default, '4',
                                  'https://imgproxy.onliner.by/A8iAG8Wku6BeYzLKSXjuXIFZuY3nSi7NGvZ2tR2Z4FM/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/NDBhZjE0M2FjOWVm/YWU0NWQ4NzZkNWM4/ZjlmYWIzNzQuanBn');
INSERT INTO productimages VALUES (default, '4',
                                  'https://imgproxy.onliner.by/USqa9Ld9FHp8SRrBHm-_f0_i-8cMfeuZCVoJoFhWEKI/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/Y2I2MjYwNTE4NTg5/YzY5MmJiNzIyZmI1/NzA3YjU2OWEuanBn');
INSERT INTO productimages VALUES (default, '4',
                                  'https://imgproxy.onliner.by/RMd5UrJnLtJsAO3qhSlA_z67AglcI4GBe3o7PGaBwu0/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/ZjM0Njc2MTYzZWIw/OWMzMzNlZDM4OGY0/ZDVmNTdiYzYuanBn');

INSERT INTO productimages VALUES (default, 3,'https://imgproxy.onliner.by/YABGEl1O6lyHqdxRm3sLI3PVdOcwyhtssMx6RxZPCDk/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MWIwMWExNzI0ZDA3/ZDY0OTU0NzE5YjA5/NmE5Nzg1MjcuanBn');
INSERT INTO productimages VALUES (default, 3,'https://imgproxy.onliner.by/riRAfHTD4qo4H-l0_F8aZCu0bbsaWbP7LEfZV2syDWM/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/YmZlNzQ1ZTIwMzg1/NjdiYjQ0NDI2M2Ux/NzA1ZGQ1OGYuanBn');
INSERT INTO productimages VALUES (default, 3, 'https://imgproxy.onliner.by/dMPgvQDnH0KBh_0S9yG96s8WylJgM5KlGoxpp9yT158/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/NThkNzhiODk2Yzky/Zjg1OWJlNTE3ZGFk/ZjdiMjI1OGYuanBn');
INSERT INTO productimages VALUES (default, 3, 'https://imgproxy.onliner.by/qick3s0J4OEoH4jUCrKKuLRBNLPRfYWHLzRinQXkBx4/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/ODcwZThjYjk3YmFi/ZDkzZTY3ZDg2NzNm/OGJiNWRkNGQuanBn');
INSERT INTO productimages VALUES (default, 3, 'https://imgproxy.onliner.by/wM2D0VL-63jX5wpye9SWM1HdTjIYc6MEkfV0tlJ5UBA/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/ODRhNGE2MjY3YzQz/YTQwYzFiZTgwZjRl/ODg2NjllNDYuanBn');

INSERT INTO productimages VALUES (default, 2, 'https://imgproxy.onliner.by/jzrvd4RyuyYU9kNqb3MNmxUOTcLo_ps-xig7VHYJEtg/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/ZjY4MjMwYjczMGQw/MmE1OTQ0N2I1NTBj/MjhjNzFhNzguanBn');
INSERT INTO productimages VALUES (default, 2, 'https://imgproxy.onliner.by/p0iK0V6ddnX-jx9RKT7EKtOlKp0VQb_NNb9XUWeW8fY/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MTk5OGU4MzI4NTQ0/MTczOGI1YzNlYTY3/NzZkZDA5ZmEuanBn');
INSERT INTO productimages VALUES (default, 2, 'https://imgproxy.onliner.by/Fo3jOS-GKqxwEUbrfpb7pfK3sAD8-xV8RM0ep-b28HI/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/NDY1ZGJhODkzZWUy/ODM0ZmIxZDBjMTQ1/N2YwODgwMjguanBn');
INSERT INTO productimages VALUES (default, 2, 'https://imgproxy.onliner.by/aE6l2t3sxaFdO8GBG7LSpVerGzZncO3zzjUvDQ-o8w4/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/OGU0NzY1ZDBiZjA1/NGI1MjZhZDczMmEx/ODFjNWQ0OGIuanBn');
INSERT INTO productimages VALUES (default, 2, 'https://imgproxy.onliner.by/p0iK0V6ddnX-jx9RKT7EKtOlKp0VQb_NNb9XUWeW8fY/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MTk5OGU4MzI4NTQ0/MTczOGI1YzNlYTY3/NzZkZDA5ZmEuanBn');

INSERT INTO productimages VALUES (default, 1, 'https://imgproxy.onliner.by/6pXx1KrxqIgMh4Fys0EUiVxaKWcFOA6QRWr7KWnWJPA/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MDUzOTQ2MGZlMzE3/ZTk5MDg3Mzg2ZDYy/NTcxYzYzNjYuanBn');
INSERT INTO productimages VALUES (default, 1, 'https://imgproxy.onliner.by/pzebOGqnqAjNOSVU-BYS4vWSnf0e6PIEn0qGxzzPwI0/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/MmRiNzY3YzQ4ZmY4/OTVlNzE5NzQ2ZjEw/YTY4MjEzNGYuanBn');
INSERT INTO productimages VALUES (default, 1, 'https://imgproxy.onliner.by/cihwNh87h1TIN2c8Oq_cOEsskJ6MbuGPKO6k3MIXaiM/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/NmRhNzZmYjI2Y2Fm/NDkzY2M1ZTUwZmFk/OGYyODBlZDYuanBn');
INSERT INTO productimages VALUES (default, 1, 'https://imgproxy.onliner.by/TWt78k1DOMF-fCdgcYpuoXaZkZ354fUTgkEEFf4kwK0/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/N2YyODVmNzk2NmQ5/YzViYjVhODE3ZTZm/YjdkZWQxMGQuanBn');
INSERT INTO productimages VALUES (default, 1, 'https://imgproxy.onliner.by/_JQtF6hdIuZd9bEZHUVd8bghZ5LdjEkobImzQRgfOZI/w:700/h:550/z:2/f:jpg/aHR0cHM6Ly9jb250/ZW50Lm9ubGluZXIu/YnkvY2F0YWxvZy9k/ZXZpY2UvbGFyZ2Uv/NTZiNjdmMWNlNjdj/YjY4Yjc4YTJlYzgy/NzI1NTJmMWQuanBn');



INSERT INTO shop VALUES (default, 'Prime', 'Общество с ограниченной ответственностью «ОНЛАЙНЕР»', 'Юридический адрес: 220123, г. Минск, ул. Старовиленская, д. 100, корп. 7 (2 этаж)', '2');
INSERT INTO shop VALUES (default, 'Newton', 'ООО «КЛИК ШОП»', 'Юридический адрес: 223050, Минская область, Минский район, с/с Колодищанский, д. 4В, ком. 16/2 (4 км автодороги "Колодищи-Сухорукие" ПАЗ с инв.№ 600/с-76807)', '3');
INSERT INTO shop VALUES (default, 'Tehnomir', 'Общество с ограниченной ответственностью "СайранЛинк"', 'Юридический адрес: 220018, г. Минск, ул. Мележа, д. 1, пом. 8', '4');
INSERT INTO shop VALUES (default, 'Mobiline', 'ООО "МалвестТрейд"', 'Юридический адрес: 220090, г. Минск, ул. Олешева, д. 9, пом. 5', '5');


INSERT INTO shopproduct VALUES (default, '1', '1', '3800', '1');
INSERT INTO shopproduct VALUES (default, '2', '1', '4199', '1');
INSERT INTO shopproduct VALUES (default, '3', '1', '3999', '1');
INSERT INTO shopproduct VALUES (default, '2', '2', '4799', '1');
INSERT INTO shopproduct VALUES (default, '3', '2', '4900', '1');
INSERT INTO shopproduct VALUES (default, '4', '2', '5099', '1');
INSERT INTO shopproduct VALUES (default, '1', '3', '2350', '1');
INSERT INTO shopproduct VALUES (default, '2', '3', '2340', '1');
INSERT INTO shopproduct VALUES (default, '3', '4', '1999', '1');
INSERT INTO shopproduct VALUES (default, '3', '4', '2079', '1');
INSERT INTO shopproduct VALUES (default, '1', '5', '2700', '1');
INSERT INTO shopproduct VALUES (default, '3', '5', '2599', '1');
INSERT INTO shopproduct VALUES (default, '4', '5', '2799', '1');

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
                            '...', '2023', '1', '...');
INSERT INTO product VALUES (default, 'Iphone 16 ProMax 256GB', '1',
                            '...', '2024', '1', '...');
INSERT INTO product VALUES (default, 'Galaxy S25 Ultra 256GB', '1',
                            '...', '2024', '2', '...');
INSERT INTO product VALUES (default, '14 T 256GB', '1',
                            '...', '2024', '3', '...');
INSERT INTO product VALUES (default, 'Pixel 9 128GB', '1',
                            '...', '2024', '2', '...');


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


INSERT INTO shop VALUES (default, 'Prime', '///', '///', '2');
INSERT INTO shop VALUES (default, 'Newton', '///', '///', '3');
INSERT INTO shop VALUES (default, 'Tehnomir', '///', '///', '4');
INSERT INTO shop VALUES (default, 'Mobiline', '///', '///', '5');


INSERT INTO shopproduct VALUES (default, '2', '3', '2350', '1');



SELECT * FROM product WHERE id=5
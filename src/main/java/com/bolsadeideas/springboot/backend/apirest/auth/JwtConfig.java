package com.bolsadeideas.springboot.backend.apirest.auth;

public class JwtConfig {
	public static final String LLAVE_SECRETA = "alguna.clave.secreta.12345678";

	public static final String RSA_PRIVADA = "-----BEGIN RSA PRIVATE KEY-----\r\n"
			+ "MIIEowIBAAKCAQEAsoLkhM8X4sfvdlnMWTWCEdBYpNefr1Vb/LMafxh8L6bD3I6B\r\n"
			+ "OqVn3gd0oGK0A9y7AC0K0tg9G+VrS2Gnu/HWl6XnlNBmHgUjYcHTl4g4HTQ1b8/q\r\n"
			+ "kLnoP9cO4Yo0vdDK6Of8gOXnMqMmggIei2EDbzKeV4y3Rkf7MnhVkC17O4ACEeev\r\n"
			+ "5gqs+jjREFPR+qgDobRGYLkcIkddnjFuM1XxYcK1+sqnrclZbD+NiTmZLtjBkT7N\r\n"
			+ "cVrQfXqMxl3ES1jpVrt+qiWJjLkwHj2Yi3p2hZqU5L3jyXd4hLYjq+E38ATHaYWQ\r\n"
			+ "xzMkwVU1LbZWdSAvzvINLil3bD7veC98x9vVyQIDAQABAoIBAD7ylS6X8G5R3ok3\r\n"
			+ "ZS3YBoPNmlSWjILBcOyNI7zJn5EWF18BCWTqytOqgV/FLoFmJrMLLxPmmLXrkohE\r\n"
			+ "aWeHAgr7v8vkKP5RBYcFWF3I9TCnJmjFQovCYrmQVnkFyU9d/w9eLtYtO/fJPFz/\r\n"
			+ "7lFr5lAh42AwCLjJzTSg5lsvDpOOGz0xvgekEuFArCaJQur9LDZL1vEKCElD2E1g\r\n"
			+ "LwDV6nvz7JaMwsZyU0j6k556Vd1uXD0X/TWkfoTRyLBIVKztOUI6CL63JeihvF6b\r\n"
			+ "CKwAhq39zGlIaSP7Xv9elJRS0X9EOaAsERLwN6si8jI1U9mLeCMK9wvrthmTVOHZ\r\n"
			+ "hZk5luECgYEA4Cr9kmo9GmFDoyI06xPKZelCRKK7c7H/0uEaui+yGwxw3sV40+RE\r\n"
			+ "H22mH87WuDfd37p4Pl9Qn0gjmSWm4GjG6HSfgNX5fXCUxUhl+ZlmXTVz3MixMaOU\r\n"
			+ "1OaukoKcCVHJO6oJdytTy8ExUoT7DriBoZh4eHWNsxsdeBtg5Peuh5UCgYEAy9wu\r\n"
			+ "QAeqc4s0WYSDx4Fq1yE3IKN17BuDaMil7jQxgNbELRj9n7tflpwZoenSBrJ5eqAS\r\n"
			+ "l1acz8dWUIt04U0Xnh9rePrKDJmLAXDM4j2iuYJwBntOfcT5W/XKMtDKSnGX8bNT\r\n"
			+ "O4oAVGCYidPIqUDH7BmBmZuIZzrZZCnNSsAI+GUCgYBHP6LEzJuLLOrwiMjFBs9H\r\n"
			+ "wPHdGtP1m9ex0PZLwykay8N8KsuSnXTBgHpSlc1NVARjPcNGH8liNu2JmZwGq4a9\r\n"
			+ "D4Q60MexhPzkD3TJ9mXArmKbA/a9zj5ZxNArpPOvSp1pJ0xG4jCKDGd+0OFy9lXN\r\n"
			+ "ZMa1krds++tL53fOjqKcWQKBgQCMcBZ8jcti5dcehCe0XPeZVIyBs5odGachnHiS\r\n"
			+ "7OnddBaZasnuLErhmpAd9tJ1QqZlT7j/AO/uQ8i2nBvcyhsnF0YWhc6Dd5NHXsoG\r\n"
			+ "YaekXLOIA5JDGlseeujcsPFq725ZV8xTC/LGLfVnnbpyvun7QGcDxx3k36m7UwDW\r\n"
			+ "Kg0D8QKBgCNHEWFPjfRzCNBrZ6soAFJnHRxJQmyHxLnIT1bGBb3nsHq5IpKbG6HN\r\n"
			+ "kEjjnqymwmmE1w3m8zLe78Pht/M0q6dwX/gtynOAsYVr+9xN3UQVQ+r1csaS5EiA\r\n"
			+ "W5ns4ySK2abVRPPjksdCo4VlBgE0IweQGlq+fRycWi8xlC5HBfkl\r\n" + "-----END RSA PRIVATE KEY-----";

	public static final String RSA_PUBLICA = "-----BEGIN PUBLIC KEY-----\r\n"
			+ "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAsoLkhM8X4sfvdlnMWTWC\r\n"
			+ "EdBYpNefr1Vb/LMafxh8L6bD3I6BOqVn3gd0oGK0A9y7AC0K0tg9G+VrS2Gnu/HW\r\n"
			+ "l6XnlNBmHgUjYcHTl4g4HTQ1b8/qkLnoP9cO4Yo0vdDK6Of8gOXnMqMmggIei2ED\r\n"
			+ "bzKeV4y3Rkf7MnhVkC17O4ACEeev5gqs+jjREFPR+qgDobRGYLkcIkddnjFuM1Xx\r\n"
			+ "YcK1+sqnrclZbD+NiTmZLtjBkT7NcVrQfXqMxl3ES1jpVrt+qiWJjLkwHj2Yi3p2\r\n"
			+ "hZqU5L3jyXd4hLYjq+E38ATHaYWQxzMkwVU1LbZWdSAvzvINLil3bD7veC98x9vV\r\n" + "yQIDAQAB\r\n"
			+ "-----END PUBLIC KEY-----";

}

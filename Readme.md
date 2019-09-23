03 - Spring Cloud Feign


### Inatalando um projeto basico

![072714346c8238edd889b6680d4acbbb.png](_resources/49e34598a4e34259ac1631b0c8edda56.png)

------
------

### Testando

Para testar crei dois microserviços
- um que tem uma api exporta
- um que consome essa api através do **Feign**

1. **O que exporta uma api**

![2360e823a8a8ed7d08838d009cf48464.png](_resources/d9acac86a22a4dea96f222896f8985a9.png)

- Postman

```
localhost:8051/api
```

![13b015784ca2c38d5190da190cc3407e.png](_resources/522687df3a75401293913116c68cce4d.png)

------

2. **O que consome a api criada anteriomente**

![d1ea373f7825623c6ab1f350b9dcab07.png](_resources/cffc388edc964947b14334f9dc37ebee.png)


- Postman

```
localhost:8052/api
```

![872e5867dde0b93a1db0ba68b5c799be.png](_resources/6372cf8087d34053a79c5472ed177f85.png)


------

3. Usando o Zuul para realizar a chamada

Caso nao tenha configurado o zuul veja:

[02 - Spring Cloud Zuul](:/1b05b5e836ed4ca8ae4b4fc734a0c37c)

- Postman

**msv-teste1**

```
localhost:8080/msv-teste1/api
```

![458ce4852c41291beed898e258f7e2a9.png](_resources/cff3b29b251843acb846bd395651b545.png)

**msv-teste2**
```
localhost:8080/msv-teste2/api
```

![313808569a3678e99ffea10c946c940c.png](_resources/27af4ce2bfec4c969974b08107bd78c8.png)


### Implementando failback

Para implementar e so criar uma classe que implemente os metodos da interface do feign criada

![c44038b80f8a15faf3e1d4532bebe9cc.png](_resources/f2bff864f41943649bfa242d471a85c3.png)

Caso dê timeout o failback vai executar, isso pode ser util para retornar um dado de cache, ou dispara e-mail ou coisa do tipo.





class Banco():

    def __init__(self, valor, nome):
        self.valor = valor
        self.nome = nome

    def get_valor(self):
        return self.valor

    def get_nome(self):
        print(self.nome)

    def set_apelido(self, apelido):
        self.apelido = apelido

    def set_valor(self, deposito):
        self.saldo = deposito + self.valor

    def get_saldo(self):
        return self.saldo

    def get_apelido(self):
        print(self.apelido)



teste = Banco(250, 'Ju')

print(teste.get_nome())
print(teste.get_valor())

deposito = int(input('Digite o valor que pretende depositar: '))
teste.set_valor(deposito)

apelido = str(input('Digite seu apelido: '))
teste.set_apelido(apelido)

print(teste.get_apelido())
print(teste.get_saldo())


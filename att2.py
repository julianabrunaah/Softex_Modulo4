
class Dados:

    estoque = 0
    totalAp = 0
    def __init__(self, aparelho, modelo, marca, estoque):
        self.aparelho = aparelho
        self.modelo = modelo
        self.marca = marca
        self.estoque = estoque

    def ExibirAp(self):
        print('Aparelho : ',self.aparelho)

    def ExibirModelo(self):
        print('Modelo do aparelho: ',self.modelo)

    def ExibirMarca(self):
        print('A marca do aparelho: ',self.marca)

    def Aparelhos(self):
        totalAp = 0
        totalAp = totalAp + (self.estoque)
        print('Em estoque: ', totalAp)
        return totalAp


#objetos
ap1 = Dados('notebook', 'Dell Inspiron i15 M25P', 'Dell', 5)
ap2 = Dados('Celular', 'Iphone', '11pro', 2)
ap3 = Dados('Celular', 'Samsung', 'A22', 1)
resposta = int(input('Digite 1, 2 ou 3 para exibir Dados de um dos aparelhos: '))

if resposta == 1:
    ap1.ExibirAp()
    ap1.ExibirModelo()
    ap1.ExibirMarca()
    ap1.Aparelhos()

elif resposta == 2:
    ap2.ExibirAp()
    ap2.ExibirModelo()
    ap2.ExibirMarca()
    ap2.Aparelhos()

elif resposta == 3:
    ap3.ExibirAp()
    ap3.ExibirModelo()
    ap3.ExibirMarca()
    ap3.Aparelhos()
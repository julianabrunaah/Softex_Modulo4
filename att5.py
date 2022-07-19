
txt = 'seja forte e corajoso! Não se apavore nem desanime, ' \
      'pois o Senhor, o seu Deus, estará com você por onde você andar.'

print('Texto sem formatação ')
print(txt)
print(' ')
print('Mudando palavra "corajoso" para "Corajosa"')
print(txt.replace('corajoso', 'corajosa'))
print(' ')
print('Maiusculo')
print(txt.upper())
print(' ')
print('Minusculo')
print(txt.lower())
print(' ')
print('Primeira letra em maiuscula')
print(txt.capitalize())

print('TESTE')
txt = str(input('Escreva seu nome completo: '))
print(txt.upper())
print(txt.capitalize())
print(txt.title())

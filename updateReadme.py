import os

readme = '''# Leetcode Practice
This repository contains the codes for leetcode questions. <br>
The questions have been coded using Java. <br>
<table>
	<tr><td>Easy</td><td>{} Problems</td></tr>
	<tr><td>Medium</td><td>{} Problems</td></tr>
	<tr><td>Hard</td><td>{} Problems</td></tr>
</table>

'''.format(len(os.listdir('Easy')), len(os.listdir('Medium')), len(os.listdir('Hard')))

readme += '### Problems\n\n'

dirs = ['Easy', 'Medium', 'Hard']
color = {
	'Easy': 'https://img.shields.io/badge/-{}-%230b915e',
	'Medium': 'https://img.shields.io/badge/-{}-%23e38a29',
	'Hard': 'https://img.shields.io/badge/-{}-%23e0375b',
}
files = {}
for dir in dirs:
	for file in os.listdir(dir):
		files[file] = dir

for file in sorted(files.keys()):
	splits = file.replace('.md', '').lstrip('0')
	link = files[file]+"/"+file
	link = link.replace(" ", "%20")
	badge = color[files[file]].format(splits)
	badge = badge.replace(" ", "%20")
	readme = readme + f'<a href="{link}">![]({badge})</a>\n'
	
with open('README.md', 'w') as f:
	f.write(readme)

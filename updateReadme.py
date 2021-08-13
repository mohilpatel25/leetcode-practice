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

readme += '''|#|Problem Name|Difficulty|
|:---:|---|:---:|
'''

dirs = ['Easy', 'Medium', 'Hard']
color = {
	'Easy': 'https://img.shields.io/badge/-Easy-%230b915e',
	'Medium': 'https://img.shields.io/badge/-Medium-%23e38a29',
	'Hard': 'https://img.shields.io/badge/-Hard-%23e0375b',
}
files = {}
for dir in dirs:
	for file in os.listdir(dir):
		files[file] = dir

for file in sorted(files.keys()):
		splits = file.split('.')
		link = files[file]+"/"+file
		link = link.replace(" ", "%20")
		readme = readme + '|{}|[{}]({})|![]({})|\n'.format(splits[0].lstrip('0'), splits[1][1:], link, color[files[file]])
		
with open('README.md', 'w') as f:
	f.write(readme)

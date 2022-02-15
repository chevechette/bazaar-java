# How to contribute

Start by reading this file, if there's anything in there.

## Branches

main : Never commit there directly. Pull requests from doc or dev will update the main branch.
doc : Reserved for documentation redaction (README.md, contributing.md and so on)
dev : Main branches where we make can merge personnal solutions or add stable solutions.

Personal branches :
	kdev : Tuonetar's sandbox.

## Small git reminder.

### Information
git status : Tells you if you need to git pull and keeps track of your local modifications.€ý,€ý,
git pull : updates your local files.
git branch -a : Lists existing branches

### Branches stuff
git checkout $branch : Switching your local folder to the $branch branch.

### Typical git commit procedure
git pull : Always do that, all the time.
git add $file : Flag a file you modified to be upload during the next push.
git rm $file : Careful, this deletes your files, and set up the deletion from the repository.
git commit -m "$message" : Set up the future push with your commentary
git push [-u $branch] : Pushes your commited files to the git repository. I recommend specifying which branch you wish to push to to avoid confusion.


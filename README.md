# COMP210 Workspace - Summer Session 2022

Your work in the course will be completed in this workspace. Instructions for the two most common tasks you'll perform can be found below.

## Backup Your Work

"Push" your work up to GitHub for backup. By creating "commits", which you can think of as versioned checkpoints in your workspace, you are not at risk of losing your work. It's easy to revert back to an old version or to restore your entire workspace on a different computer.

1. Select the _Git_ menu along the top of your screen and then choose "Commit".
2. Notice the files listed under Changes. These are files you've made modifications to since your last backup.
3. Ensure all the files that you'd like to backup are selected. Your cursor should be inside of a message box where you will write a nice description of the modifications you've made to your code, like "Finished EX01!", and then hit the "Commit" button.
   - If you do not want to backup _all_ changed files, you can select them individually. For this course you're encouraged to back everything up.
   - IntelliJ might tell you there are some warnings or errors here, and you should just commit anyway!
5. If you open the _Git_ at the bottom of your screen, you should see this commit added to your chain of git commits. However, it has just been added to your local ``main`` branch, and needs to be pushed to your remote backup.
6. Select the _Git_ menu along the top of your screen again and then choose "Push".
7. A pop-up should appear that displays: "main -> main : backup", which means your latest local commit on the local main branch is going to be pushed to the main branch on the remote backup. Hit the "Push" button.
8. If you want to see your backed up work on Github, navigate to the following URL but replace `USERNAME` with your GitHub username:
   - `https://github.com/summer-210/comp210-workspace-USERNAME`
   - You can also verify it was pushed successfully by opening the _Git_ view along the bottom of your screen and verifying the latest commit appears on the local and remote branches. (The text next to the tag icons should say main & origin, next to the latest commit message)

## Download New Course Material

"Pulling" course materials down from Upstream. As new lesson material or starter code for exercises is added to our central course repository, these are the steps you'll take to download them into your own workspace repository.

1. Open the _Git_ menu from along the top and select _Pull_ 
   - This should open a pop-up that is auto-populated with the correct options. The correct command is `git pull origin main`. We are pulling code from the course source repo into our local repo.
5. This downloads the latest course materials! It will succeed silently, so if nothing appears to happen it worked (and any new files will be available in the file explorer). If there was an error, you would see an error message pop up.

## Setup Backup Course Material Repository

When you are first setting up your personal workspace repository, you will need to follow these instructions to connect the repository on your computer with your personal "backup" course repository on GitHub. As we add new material through the course, you will then be able to easily back it up to your backup repo.

1. Navigate a web browser to <https://classroom.github.com/a/sHeSKMlQ>
2. Join the Classroom by selecting your ONYEN (Clicking "Skip to the next step" is also OK)
3. Click "Accept this Assignment"
4. When the workspace is getting setup you may need to refresh until it tells you you're ready to go!
5. Click the link to your personal backup repository that looks something like this `https://github.com/summer-210/comp210-workspace-kakiryan` (except instead of `kakiryan` you will see your GitHub username).
6. Toward the top of the page it will say "Quick setup" and you will see two buttons: HTTPS and SSH. Click HTTPS and copy the text of the URL in the box to the right of the buttons (or click the clipboard icon)
7. With your workspace open in VSCode, type in _Git: Add Remote_ and press enter with the option selected.
10. In the blank text box that appears, paste in the URL to your backup repository that you just copied. Press enter.
11. When asked for "Remote name" type in: `backup`
12. Follow the steps in the section above on how to "Backup your work."

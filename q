# System-wide .profile for sh(1)

if [ -x /usr/libexec/path_helper ]; then
	eval `/usr/libexec/path_helper -s`
fi

if [ "${BASH-no}" != "no" ]; then
	[ -r /etc/bashrc ] && . /etc/bashrc
fi

export JAVA_HOME="$(/usr/libexec/java_home)"
export M2_HOME=/Users/ben/Development/maven
export PATH=/Users/ben/Development/maven/bin:$PATH

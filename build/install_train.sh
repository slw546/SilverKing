#!/bin/ksh

source `dirname $0`/lib/run_scripts_from_any_path.snippet
source lib/common.lib

build_sk.sh

echo "Current working directory: $(pwd)"

echo "Making install area"

mkdir -p ../install/common/lib
mkdir -p ../install/common/bin/lib

ls -l ..

echo "Copying artifacts to install"
cp ../bin/lib/* ../install/common/bin/lib
cp ../lib/*.jar ../install/common/lib/
cp ../bin/*.sh ../install/common/bin/
f_copyVerbose "$SILVERKING_JAR"  "../install/common/lib/silverking.jar"   # copy silverking jar to install

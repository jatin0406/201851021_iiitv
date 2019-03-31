import 'package:flutter/material.dart';

void main() {
  runApp(Container(child: MYCLASS()));
}

class MYCLASS extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return Container(
      child: Center(
        child: Text("hello world", textDirection: TextDirection.ltr),
      ),
//alt+enter to the wrap the stuff inn the padding
    );
  }
}

JW_APP_NAME.directive('ngClose', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngClose);
            element.on('close', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 
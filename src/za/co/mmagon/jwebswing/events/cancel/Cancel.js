JW_APP_NAME.directive('ngCancel', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngCancel);
            element.on('cancel', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 
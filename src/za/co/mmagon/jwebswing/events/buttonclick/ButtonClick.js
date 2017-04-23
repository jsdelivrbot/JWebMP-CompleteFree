JW_APP_NAME.directive('ngButtonClick', function ($parse) {
        return function (scope, element, attrs) {
            var fn = $parse(attrs.ngButtonClick);
            element.on('buttonclick', function (event) {
                scope.$apply(function () {
                    event.preventDefault();
                    fn(scope, {$event: event});
                });
            });
        };
    }); 